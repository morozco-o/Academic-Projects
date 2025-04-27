// Declarations 

// boolean checking elements
//form is valid, each element is valid
let titleCheck=false;
let descriptionCheck=false;
let genreCheck=false;
let subjectCheck=false;
let starCheck=false;
let yearCheck=false;
let productionCheck=false;
let directorCheck=false;

//Function checking the each element is valid s.t. form can submit
function validate() {
	validateTitle();
	validateDescription();	
	validateGenre();
	validateSubject();
	validateYear();
	validateStar();
	validateProduction();
	validateDirector();
	
	return (titleCheck&&descriptionCheck&&genreCheck&&subjectCheck&&starCheck&&yearCheck&&productionCheck&&directorCheck);
}

function validateTitle() {
	let title=document.getElementById("title");
	let error=document.getElementById("errTitle");
	if (title.value==0) {
	title.style="border: red 2px solid";
	error.style.display="block";
	titleCheck=false;
	}
	else {
	error.style.display="none";
	title.style="border: grey 1px solid";
	titleCheck=true;
	}
}

function validateDescription() {
	let title=document.getElementById("description");
	let error=document.getElementById("errDescription");
	if (title.value==0) {
	title.style="border: red 2px solid";
	error.style.display="block";
	descriptionCheck=false;
	}
	else {
	error.style.display="none";
	title.style="border: grey 1px solid";
	descriptionCheck=true;
	}
}
function validateGenre() {
	let title=document.getElementById("genre");
	let error=document.getElementById("errGenre");
	if (title.value=="Choose genre") {
	title.style="border: red 2px solid";
	error.style.display="block";
	genreCheck=false;
	}
	else {
	error.style.display="none";
	title.style="border: grey 1px solid";
	genreCheck=true;
	}
}
function validateSubject() {
	let title=document.getElementById("subject");
	let error=document.getElementById("errSubject");
	if (title.value=="Choose subject") {
	title.style="border: red 2px solid";
	error.style.display="block";
	subjectCheck=false;
	}
	else {
	error.style.display="none";
	title.style="border: grey 1px solid";
	subjectCheck=true;
	}
}
function validateYear() {
	let title=document.getElementById("year");
	let error=document.getElementById("errYear");
	if (title.value==0) {
	title.style="border: red 2px solid";
	error.style.display="block";
	yearCheck=false;
	}
	else {
	error.style.display="none";
	title.style="border: grey 1px solid";
	yearCheck=true;
	}
}
function validateStar() {
	let title=document.getElementById("Star");
	let error=document.getElementById("errStar");
	if (title.value==0) {
	title.style="border: red 2px solid";
	error.style.display="block";
	starCheck=false;
	}
	else {
	error.style.display="none";
	title.style="border: grey 1px solid";
	starCheck=true;
	}
}
function validateProduction() {
	let title=document.getElementById("production");
	let error=document.getElementById("errProduction");
	if (title.value==0) {
	title.style="border: red 2px solid";
	error.style.display="block";
	productionCheck=false;
	}
	else {
	error.style.display="none";
	title.style="border: grey 1px solid";
	productionCheck=true;
	}
}
function validateDirector() {
	let title=document.getElementById("coStar");
	let error=document.getElementById("errDirector");
	if (title.value=="Choose Main Director") {
	title.style="border: red 2px solid";
	error.style.display="block";
	directorCheck=false;
	}
	else {
	error.style.display="none";
	title.style="border: grey 1px solid";
	directorCheck=true;
	}
}
