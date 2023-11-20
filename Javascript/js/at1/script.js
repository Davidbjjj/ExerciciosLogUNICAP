
 
    function mFuncao(){
        var x = document.getElementById("paragrafo");
        x.innerHTML="Hello!";
    }

    let lampadaligada= true; 

    function ligaredes(){
        var y = document.getElementById('lampada');
        if(lampadaligada.src){
            y.src='Img/Opera Instantâneo_2023-11-15_154807_www.istockphoto.com.png';
        }else{
            y.src='Img/Opera Instantâneo_2023-11-15_154900_www.istockphoto.com.png';
        }
    }