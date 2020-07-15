
<?php 
if(isset($_POST['submit'])){
    $from = "sgouin@sps-program.com"; // sender's address
    $to = $_POST['email']; // user's address
    $name = $_POST['name']; // user's name
    $subject = "WordList Report";
    $subject2 = "Copy of your form submission";
    $message = $name . "'s results:" . "\n\n";
    $headers = "From:" . $from;
    $headers2 = "From:" . $to;
    mail($to,$subject,$message,$headers);
    echo "Mail Sent. Thank you ";
    header('Location: emailform.html'); //redirect
    }
?>