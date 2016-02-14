
<h3>Entrega de soluci&oacute;n</h3>
<div id="clockdiv">
  <div>
    <span class="days"></span>
    <div class="smalltext">Dias</div>
  </div>
  <div>
    <span class="hours"></span>
    <div class="smalltext">Horas</div>
  </div>
  <div>
    <span class="minutes"></span>
    <div class="smalltext">Minutos</div>
  </div>
  <div>
    <span class="seconds"></span>
    <div class="smalltext">Segundos</div>
  </div>
</div>

<br />
<br />
<div style="">
  <p>Sube el <b>c&oacute;digo fuente</b> (un unico archivo o un archivo en .zip), adem&aacute;s <b>la salida de al menos un set de datos</b>.</p>
  <div class="layout-column">
    <div layout="column">
      <div>
        <svg fill="#000000" height="24px" viewBox="0 0 24 24" width="24px" xmlns="http://www.w3.org/2000/svg" fit="" preserveAspectRatio="xMidYMid meet">
          <path d="M0 0h24v24H0z" fill="none"></path>
          <path d="M17.63 5.84C17.27 5.33 16.67 5 16 5L5 5.01C3.9 5.01 3 5.9 3 7v10c0 1.1.9 1.99 2 1.99L16 19c.67 0 1.27-.33 1.63-.84L22 12l-4.37-6.16z"></path>
        </svg>

        <label><b>C&oacute;digo fuente</b></label>
      </div>

      <div>
        <label for="input_3">C&oacute;digo fuente (obligatorio)</label>
        <input type="file" placeholder="Elige fichero" id="input_3">
        <div ></div>
      </div>

      <br />
      <div layout="column">
        <div>
          <svg fill="#000000" height="24px" viewBox="0 0 24 24" width="24px" xmlns="http://www.w3.org/2000/svg" fit="" preserveAspectRatio="xMidYMid meet">
            <path d="M0 0h24v24H0z" fill="none"></path>
            <path d="M17.63 5.84C17.27 5.33 16.67 5 16 5L5 5.01C3.9 5.01 3 5.9 3 7v10c0 1.1.9 1.99 2 1.99L16 19c.67 0 1.27-.33 1.63-.84L22 12l-4.37-6.16z"></path>
          </svg>
          <label><b>Set de datos</b></label>
        </div>

        <div>
          <label class="ng-binding" for="input_4">Datos para ser calificado</label>
          <input type="file" placeholder="Elige fichero" id="input_4">
          <div class="md-errors-spacer"></div>
        </div>
      </div>

    </div>

    <br />
    <div class="layout-gt-sm-row">
      <button type="button" disabled="disabled">
      <span class="ng-scope">Enviar</span>
      </button>
    </div>
  </div>

  <script>
    function getTimeRemaining(endtime) {
      var t = Date.parse(endtime) - Date.parse(new Date());
      var seconds = Math.floor((t / 1000) % 60);
      var minutes = Math.floor((t / 1000 / 60) % 60);
      var hours = Math.floor((t / (1000 * 60 * 60)) % 24);
      var days = Math.floor(t / (1000 * 60 * 60 * 24));
      return {
        'total': t,
        'days': days,
        'hours': hours,
        'minutes': minutes,
        'seconds': seconds
      };
    }

    function initializeClock(id, endtime) {
      var clock = document.getElementById(id);
      var daysSpan = clock.querySelector('.days');
      var hoursSpan = clock.querySelector('.hours');
      var minutesSpan = clock.querySelector('.minutes');
      var secondsSpan = clock.querySelector('.seconds');

      function updateClock() {
        var t = getTimeRemaining(endtime);

        daysSpan.innerHTML = t.days;
        hoursSpan.innerHTML = ('0' + t.hours).slice(-2);
        minutesSpan.innerHTML = ('0' + t.minutes).slice(-2);
        secondsSpan.innerHTML = ('0' + t.seconds).slice(-2);

        if (t.total <= 0) {
          clearInterval(timeinterval);
        }
      }

      updateClock();
      var timeinterval = setInterval(updateClock, 1000);
    }

    var deadline = new Date(Date.parse(new Date("February 15, 2016 23:55:00")));
    initializeClock('clockdiv', deadline);
  </script>