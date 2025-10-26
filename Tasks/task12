<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Persistent To-Do List</title>
<style>
  li.completed { text-decoration: line-through; color: gray; }
  li { cursor:pointer; margin:3px 0; }
</style>
</head>
<body>

<h2>To-Do List</h2>
<input type="text" id="taskInput" placeholder="Enter task">
<button id="addBtn">Add</button>
<ul id="taskList"></ul>

<script>
const input = document.getElementById("taskInput"),
      addBtn = document.getElementById("addBtn"),
      list = document.getElementById("taskList");

input.value = sessionStorage.getItem("tempTask") || "";

let tasks = JSON.parse(localStorage.getItem("tasks") || "[]");


function renderTasks(){
  list.innerHTML = "";
  tasks.forEach((t,i)=>{
    const li = document.createElement("li");
    li.textContent = t.text;
    if(t.completed) li.classList.add("completed");

  
    li.addEventListener("click", ()=>{
      t.completed = !t.completed;
      localStorage.setItem("tasks", JSON.stringify(tasks));
      renderTasks();
    });
    li.addEventListener("dblclick", ()=>{
      tasks.splice(i,1);
      localStorage.setItem("tasks", JSON.stringify(tasks));
      renderTasks();
    });

    list.appendChild(li);
  });
}

addBtn.addEventListener("click", ()=>{
  const text = input.value.trim();
  if(!text) return;
  tasks.push({text, completed:false});
  localStorage.setItem("tasks", JSON.stringify(tasks));
  input.value = "";
  sessionStorage.removeItem("tempTask");
  renderTasks();
})
input.addEventListener("input", ()=>sessionStorage.setItem("tempTask", input.value));

renderTasks();
</script>

</body>
</html>
