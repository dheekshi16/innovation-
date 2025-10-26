<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Simple Feedback Form</title>
<style>
  input, select, textarea { display:block; margin:5px 0; padding:5px; width:250px; }
  .error { border:2px solid red; }
</style>
</head>
<body>

<h2>Feedback Form</h2>
<form id="form">
  <input type="text" id="name" placeholder="Name">
  <input type="email" id="email" placeholder="Email">
  <select id="type">
    <option value="">Select Type</option>
    <option value="bug">Bug</option>
    <option value="feature">Feature</option>
    <option value="general">General</option>
  </select>
  <textarea id="comments" placeholder="Comments"></textarea>
  <button type="submit">Submit</button>
</form>

<script>
const form = document.getElementById("form");
const nameInput = document.getElementById("name");
const emailInput = document.getElementById("email");
const typeSelect = document.getElementById("type");
form.addEventListener("submit", e => {
  let valid = true;
  [nameInput, emailInput, typeSelect].forEach(el => el.classList.remove("error"));

  if(!nameInput.value.trim()){ nameInput.classList.add("error"); valid=false; }
  if(!emailInput.value.match(/^[^\s@]+@[^\s@]+\.[^\s@]+$/)){ emailInput.classList.add("error"); valid=false; }
  if(!typeSelect.value){ typeSelect.classList.add("error"); valid=false; }

  if(!valid) e.preventDefault();
});
[nameInput,emailInput,typeSelect].forEach(el => {
  el.addEventListener("focus", ()=>el.style.background="#e0f7fa");
  el.addEventListener("blur", ()=>el.style.background="white");
});
</script>

</body>
</html>
