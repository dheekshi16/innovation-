<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Simple To-Do List</title>
<style>
  li.completed { text-decoration: line-through; color: gray; }
</style>
</head>
<body>

<h2>To-Do List</h2>
<input id="taskInput" placeholder="Enter a task">
<button id="addBtn">Add</button>
<ul id="taskList"></ul>

<script>
const input = document.getElementById("taskInput");
const list = document.getElementById("taskList");

function addTask() {
  if(!input.value.trim()) return;
  const li = document.createElement("li");
  li.textContent = input.value;
  li.addEventListener("click", ()=>li.classList.toggle("completed"));
  li.addEventListener("dblclick", ()=>list.removeChild(li));
  list.appendChild(li);
  input.value = "";
}

document.getElementById("addBtn").addEventListener("click", addTask);
input.addEventListener("keypress", e=>{if(e.key==="Enter") addTask();});
</script>

</body>
</html>
