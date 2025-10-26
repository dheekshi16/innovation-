<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Weather Simulator</title>
</head>
<body>

<h2>Weather App Simulator</h2>
<div id="output"></div>

<script>
const output = document.getElementById("output");

function fetchWeather(city){
  return new Promise((resolve,reject)=>{
    setTimeout(()=>{
      if(Math.random()>0.2) resolve({city, temp: Math.floor(Math.random()*35+10)});
      else reject("Failed to fetch " + city);
    }, 1000);
  });
}

async function getWeatherSequential(){
  try{
    const a = await fetchWeather("Delhi");
    const b = await fetchWeather("Mumbai");
    output.innerHTML += `Delhi: ${a.temp}°C<br>`;
    output.innerHTML += `Mumbai: ${b.temp}°C<br>`;
  } catch(e){ output.innerHTML += e + "<br>"; }
}

async function getWeatherParallel(){
  const cities = ["Chennai","Kolkata","Bangalore"];
  try{
    const results = await Promise.all(cities.map(fetchWeather));
    results.forEach(r=>output.innerHTML += `${r.city}: ${r.temp}°C<br>`);
  } catch(e){ output.innerHTML += e + "<br>"; }
}

getWeatherSequential();
getWeatherParallel();
</script>

</body>
</html>
