
<?php
$genres = ["Action", "Adventure", "Comedy", "Drama"];
$subjects = ["Animation", "Children and Youth", "People"];
$directors = ["Roger Allers", "Tim Burton", "Wes Anderson"];

function generateOptions($array) {
    $options = "";
    foreach ($array as $value) {
        $options .= "<option>$value</option>";
    }
    return $options;
}

?>

<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="utf-8">
    <title>Chapter 12</title>    
    
    <link rel="stylesheet" href="css/styles1.css" />
	<script src="script.js" defer></script>
   

</head>

<!-- 
	name:			Rodrigo Orozco
	filename:		index.php
	date:			2025-03-30
	description:	Lab 5 using php concepts
-->


<body>
<?php include 'headerM.php'; ?>

    
<main>
<form class="form" method="post" action="process.php" id="mainForm" onsubmit="return validate();">
   <fieldset class="form__panel">
      <legend class="form__heading">Edit Movie Details</legend>
        <p class="form__row">
           <label>Title</label><br/>
           <input type="text" name="title" id="title" class="form__input form__input--large" >
		   <p id="errTitle" hidden>Please enter a Title</p>
		 
       </p>
       <p class="form__row">
           <label>Description</label><br/>
           <input type="text" name="description" id="description" class="form__input form__input--large">
		   <p id="errDescription" hidden>Please enter a Description</p>
       </p>            
       <p class="form__row"> 
           <label>Genre</label><br/>
           <select name="genre" id="genre" class="form__input form__select">
              <option>Choose genre</option> 
               <?php echo generateOptions($genres); ?>
           </select>
		   <p id="errGenre" hidden>Please enter a Genre</p>
       </p>
       <p class="form__row"> 
           <label>Subject</label><br/>
           <select name="subject" id="subject" class="form__input form__select">
              <option>Choose subject</option> 
               <?php echo generateOptions($subjects); ?>
           </select>
		   <p id="errSubject" hidden>Please enter a Subject</p>
       </p>
       <p class="form__row">	
           <label>Star</label><br/>               
           <input type="text" name="Star" id="Star" class="form__input form__input--medium" />
		   <p id="errStar" hidden>Please enter a star</p>
       </p>
	   
	  
	  
       <p class="form__row">	
           <label>Year</label><br/>               
           <input type="text" name="year" id="year"class="form__input form__input--small" />
		   <p id="errYear" hidden>Please enter a year</p>
	   </p>  
       <p class="form__row">	
           <label>Production</label><br/>               
           <input type="text" name="Production" id="production" class="form__input form__input--medium"/>
		   <p id="errProduction" hidden>Please enter a Production</p>      
	  </p>  
		<p class="form__row"> 
           <label>Main Director</label><br/>
           <select name="coStar" id="coStar" class="form__input form__select">
              <option>Choose Main Director</option> 
               <?php echo generateOptions($directors); ?>
           </select>
		   <p id="errDirector" hidden>Please enter a Director</p>     
		</p>	   

       <div class="form__box"> 
          <input type="submit" class="form__btn"> <input type="reset" value="Clear Form" class="form__btn">      
       </div>
   </fieldset>
</form>
</main>    
<?php include 'FooterM.php'; ?>
</body>
</html>


