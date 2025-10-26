<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Digital Clock</title>
    <style>
        body {
            background-color: black;
            color: green;
            font-size: xx-large;
            margin-left: 550px;
            margin-top:250px;
            border:5px solid green;
            width:200px;
            text-align:center;
            padding:10px;
        }
    </style>
</head>
<body>
    <div id="clock">Loading...</div>

    <script>
        function DigitalClock() {
            const now = new Date();
            let hours = now.getHours();
            let minutes = now.getMinutes();
            let seconds = now.getSeconds();

            const ampm = hours >= 12 ? 'PM' : 'AM';
            hours = hours % 12 || 12;

            const hh = String(hours).padStart(2, '0');
            const mm = String(minutes).padStart(2, '0');
            const ss = String(seconds).padStart(2, '0');

            const timeString = `${hh}:${mm}:${ss} ${ampm}`;
            document.getElementById("clock").textContent = timeString;
        }
        DigitalClock();
        setInterval(DigitalClock, 1000);
    </script>
</body>
</html>
