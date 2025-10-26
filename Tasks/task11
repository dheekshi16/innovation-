<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Live Search Filter</title>
<style>
  li { cursor:pointer; margin:3px 0; }
</style>
</head>
<body>

<h2>Live Search Filter</h2>
<input type="text" id="search" placeholder="Search...">
<ul id="list">
  <li>Apple</li>
  <li>Banana</li>
  <li>Orange</li>
  <li>Mango</li>
  <li>Pineapple</li>
  <li>Grapes</li>
</ul>

<script>
const search = document.getElementById("search");
const list = document.getElementById("list");
function debounce(fn, delay){
  let timeout;
  return function(...args){
    clearTimeout(timeout);
    timeout = setTimeout(()=>fn.apply(this, args), delay);
  }
}
function filterList(){
  const term = search.value.toLowerCase();
  Array.from(list.children).forEach(li=>{
    li.style.display = li.textContent.toLowerCase().includes(term) ? "" : "none";
  });
}
search.addEventListener("input", debounce(filterList, 300));
list.addEventListener("click", e=>{
  if(e.target.tagName === "LI"){
    alert("You clicked: " + e.target.textContent);
