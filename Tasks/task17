<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Crypto Ticker</title>
</head>
<body>

<h2>Live Crypto Prices</h2>
<div id="prices">Loading...</div>
<button id="startBtn">Start</button>
<button id="stopBtn">Stop</button>

<script>
const pricesDiv = document.getElementById("prices");
const startBtn = document.getElementById("startBtn");
const stopBtn = document.getElementById("stopBtn");
let intervalId;

async function fetchPrices(){
  const loader = setTimeout(()=>pricesDiv.textContent="Fetching...",5000);
  try{
    const res = await fetch("https://api.coingecko.com/api/v3/simple/price?ids=bitcoin,ethereum&vs_currencies=usd");
    const data = await res.json();
    pricesDiv.innerHTML = `Bitcoin: $${data.bitcoin.usd}<br>Ethereum: $${data.ethereum.usd}`;
  } catch(e){ pricesDiv.textContent="Error fetching prices"; }
  clearTimeout(loader);
}

startBtn.addEventListener("click", ()=>{
  fetchPrices();
  intervalId = setInterval(fetchPrices,10000);
});

stopBtn.addEventListener("click", ()=>clearInterval(intervalId));
</script>

</body>
</html>
