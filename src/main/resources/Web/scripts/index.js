/**
*
 */
 	
	
 function validate()
 {
	var username=document.getElementById("username").value;
	var password=document.getElementById("password").value;
if(username =="rays@gmail.com"&& password =="b" && document.getElementById("manager").checked == true)
{
	window.open("manager.html");
	//window.location.href = "employee.html";
} else if(username =="salt@gmail.com"&& password =="c" && document.getElementById("employee").checked == true)
	//window.open("manager.html");
	//window.location.href = "manager.html";
	{
		//window.location.href = "manager.html";
		window.open("employee.html");
	}

else
{
	alert("login failed");
}
}

	
	
//function getall(){
	//window.location.href = "EmployeeRequest.html";
	//fetch('http://localhost:8080/Em')
	//.then(response => response.json())
	//.then(data => console.log(data));
//}	
	
//var apiURL = 'http://localhost:8080/Em';
function getinfo(){
	//window.location.href = "EmployeeRequest.html";
	var apiURL = 'http://localhost:8080/Em';
    //alert("it works");
    fetch(apiURL)
    .then(response => response.json())  // convert to json
    .then(json => displayData(json))    //pass data to displayData() OR print data to console
    .catch(err => console.log('Request Failed', err)); // Catch errors
}

function displayData(response) {
	console.log(response)
    var tabl = document.getElementById('allDataDiv');

   //alert(response.length)
   //var list=document.createElement("ul");

   for(i=1;i<response.length;i++){
   // var item=document.createElement("li");
       //item.innerHTML=response[i].id +" "+response[i].name;
       
       var row =tabl.insertRow(i)
       
       var sec1 = row.insertCell(0);
        var sec2 = row.insertCell(1);
         var sec3 = row.insertCell(2);
          var sec4 = row.insertCell(3);
           var sec5 = row.insertCell(4);
            var sec6 = row.insertCell(5);
            
            sec1.innerHTML =response[i].id;
             sec2.innerHTML =response[i].email;
              sec3.innerHTML =response[i].f_name;
               sec4.innerHTML =response[i].amount;
                sec5.innerHTML =response[i].reason;
                 sec6.innerHTML =response[i].status;
       
       //alert(response[i].id +" "+response[i].name);
       //tabl.appendChild(item);
   }
 
tabl;
}

var apiURL = 'http://localhost:8080/Emp';
function getall(){
	//window.location.href = "SpeEmployeeRequest.html";
    //alert("it works");
    fetch(apiURL)
    .then(response => response.json())  // convert to json
    .then(json => displayData(json))    //pass data to displayData() OR print data to console
    .catch(err => console.log('Request Failed', err)); // Catch errors
}

function displayData(response) {
    var table = document.getElementById('allData');

   //alert(response.length)
   //var list=document.createElement("ul");

   for(i=0;i<response.length;i++){
   // var item=document.createElement("li");
       //item.innerHTML=response[i].id +" "+response[i].name;
       
       var row =table.insertRow(i)
       
       var secc1 = row.insertCell(0);
        var secc2 = row.insertCell(1);
           var secc3 = row.insertCell(2);
            var secc4 = row.insertCell(3);
            
            secc1.innerHTML =response[i].id;
             secc2.innerHTML =response[i].amount;
                secc3.innerHTML =response[i].reason;
                 secc4.innerHTML =response[i].status;
       
       //alert(response[i].id +" "+response[i].name);
       //tabl.appendChild(item);
   }
 
table;
}

function newRequest() {
	window.location.href = "NewReim.html";
	
}

function postRe(){
	var Ename = document.getElementById('Rname');
	var Eamount = document.getElementById('Ramount');
	var Ereason = document.getElementById('Rreason');
	//console.log(Ename.value);
	
	fetch('http://localhost:8080/Employee',{
		method: 'POST',
		headers: {'Content-Type': 'application/json'},
		body: JSON.stringify({
			name: Ename.value,
			amount: Eamount.value,
			reason: Ereason.value
		
		})
	})
}

function afterRequest() {
	window.location.href = "afterrequest.html";
	}
