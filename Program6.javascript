<!DOCTYPE html>
<html lang="en">
<head>
    <title>To-Do List</title>
</head>
<body>
    <textarea id="inputvalue" cols="24" rows="4" ></textarea>
    <button onclick="todoList()">Add Task</button>
    <ul id="listcontent"></ul>

    <script>
        function todoList() {
            let textvalue = document.getElementById("inputvalue").value.trim();
            if (textvalue === "") return;

            let li = document.createElement("li");
            li.textContent = textvalue;
            document.getElementById("listcontent").appendChild(li);

            let removeBtn=document.createElement("button");
            removeBtn.textContent="remove";
            removeBtn.addEventListener("click", function(e){
                li.remove();
            })
            li.appendChild(removeBtn);
        }
    </script>
</body>
</html>
