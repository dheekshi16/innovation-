<!DOCTYPE html>
<html lang="en">
<body>
<script>
    //task1
        function vote(age){
            if(age>=18){
                const iscloudy=true;
                var name="dharsh";
                console.log("eligible")
                console.log(name);
                console.log(iscloudy);
            }
            console.log(name);
        }
        vote(18);
    //task2
        function plain(){
            console.log("send");
        }
        plain();
        function plain1(callback){
            console.log("reply");
            callback();
            setInterval(callback(),1000);
        }
        plain1(plain);
    </script>
</body>
</html>
