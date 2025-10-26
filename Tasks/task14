<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Form Validator</title>
<style>
  input { display:block; margin:5px 0; padding:5px; width:250px; }
  .error { border:2px solid red; }
  .valid { border:2px solid green; }
  .msg { font-size:12px; color:red; }
</style>
</head>
<body>

<h2>Form Validator</h2>
<form id="form">
  <input type="text" id="name" placeholder="Name"><span id="nMsg" class="msg"></span>
  <input type="email" id="email" placeholder="Email"><span id="eMsg" class="msg"></span>
  <input type="text" id="phone" placeholder="Phone"><span id="pMsg" class="msg"></span>
  <input type="password" id="pass" placeholder="Password"><span id="paMsg" class="msg"></span>
  <button type="submit">Submit</button>
</form>

<script>
const form = document.getElementById("form"),
      nameInput = document.getElementById("name"),
      emailInput = document.getElementById("email"),
      phoneInput = document.getElementById("phone"),
      passInput = document.getElementById("pass"),
      nMsg = document.getElementById("nMsg"),
      eMsg = document.getElementById("eMsg"),
      pMsg = document.getElementById("pMsg"),
      paMsg = document.getElementById("paMsg");

form.addEventListener("submit", e=>{
  let valid=true;
  

  if(!/^[A-Za-z\s]{2,30}$/.test(nameInput.value)){ nMsg.textContent="Invalid"; nameInput.classList.add("error"); valid=false;}
  else { nMsg.textContent=""; nameInput.classList.add("valid"); }

  if(!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(emailInput.value)){ eMsg.textContent="Invalid"; emailInput.classList.add("error"); valid=false;}
  else { eMsg.textContent=""; emailInput.classList.add("valid"); }


  phoneInput.value = phoneInput.value.replace(/\D/g,''); // auto-format
  if(!/^\d{10}$/.test(phoneInput.value)){ pMsg.textContent="10 digits"; phoneInput.classList.add("error"); valid=false;}
  else { pMsg.textContent=""; phoneInput.classList.add("valid")
  if(!/^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{6,20}$/.test(passInput.value)){ paMsg.textContent="6-20 chars letters+digits"; passInput.classList.add("error"); valid=false;}
  else { paMsg.textContent=""; passInput.classList.add("valid"); }

  if(!valid) e.preventDefault();
});
</script>

</body>
</html>
