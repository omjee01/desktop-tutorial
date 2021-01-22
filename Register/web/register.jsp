<%-- 
    Document   : register
    Created on : 22 Jan, 2021, 2:24:07 AM
    Author     : avinash.k
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

        <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col m6 offset-m3">
                    <div class="card">
                        <div class="card-containt">
                            <h3>Register Here!</h3>
                            <h5 id="msg"></h5>
                            <div class="form center-align">
                                <!--Creating Registration form-->
                                <form action="register" method="post" id="myform" >
                                    <input type="text" name="user_name" placeholder="Enter User-name"/>
                                    <input type="password" name="user_password" placeholder="Enter Password"/>
                                    <input type="email" name="user_email" placeholder="abc@def.com"/>
                                    
                                    <button type="submit" class="btn">Submit</button>
                                    <button type="reset" class="btn">Reset</button>
                                    
                                </form>
                            </div>
                            <div class="loader center-align" style="margin-top: 10px; display: none">
                                 <div class="preloader-wrapper big active">
                                    <div class="spinner-layer spinner-blue-only">
                                      <div class="circle-clipper left">
                                          <div class="circle"><h3>Please Wait</h3></div>
                                      </div><div class="gap-patch">
                                        <div class="circle"></div>
                                      </div><div class="circle-clipper right">
                                        <div class="circle"></div>
                                      </div>
                                    </div>
                                  </div>                                   
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
        //Adding Jquery library
        <script
            src="https://code.jquery.com/jquery-3.5.1.min.js"
            integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0="
            crossorigin="anonymous"></script>
  
  <script>
      $(document).ready(function (){
          console.log("Document Readdddyyyyyy")
      })
      //Jquery function call ended
      
      //AJAX CALL
      
      //Grabs the form with ID-myform and runs the callback function when the 'submit' type button is clicked and gives the event object
      $("#myform").on('submit',function (event){
          
          //prevents the default behaiviour of event (in this case after clicking 'submit' button the page navigates to the next servlet)
          event.preventDefault();
          
          var f=$(this).serialize();//Here 'this' means the the current element (in this case 'myform'
          //^ Above code will serialise the whole form (i.e. it will convert the form elements into string and store it in 'f' variable
          
          console.log(f);//prints the all elent of form in Key-Value format
          
          //Showing the loader
          $(".loader").show();
          $(".form").hide();
          
          
          //Sending the f (key-value pair of form elements) into our servlet by AJAX request
         // $.ajax( url, settings )  <- Syntax
         $.ajax({
             url: "register",
             data: f,
             type: 'POST',
             //If request is successful
             success: function (data, textStatus, jqXHR) {
                        console.log(data);
                        console.log("Success.....");
                         $(".loader").hide();
                         $(".form").show();
                    },
             //If not
            error: function (jqXHR, textStatus, errorThrown) {
                        console.log(data);
                        console.log("Failed.....");
                         $(".loader").hide();
                         $(".form").show();
                    }
         })
          
          
          
      })
  </script>
        
        
        
    </body>
</html>
