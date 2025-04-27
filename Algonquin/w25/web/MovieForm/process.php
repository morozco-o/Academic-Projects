<?php
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    
    $title = $_POST['title'] ?? 'N/A';
    $description = $_POST['description'] ?? 'N/A';
    $genre = $_POST['genre'] ?? 'N/A';
    $subject = $_POST['subject'] ?? 'N/A';
    $star = $_POST['Star'] ?? 'N/A';
    $year = $_POST['year'] ?? 'N/A';
    $production = $_POST['Production'] ?? 'N/A';
    $director = $_POST['coStar'] ?? 'N/A';

} else {
    header("Location: index.php");
    exit();
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Submitted Movie Details</title>
    <link rel="stylesheet" href="css/styles1.css" />
<body>

<!-- 
	name:			Rodrigo Orozco
	file:           process.php
	date:			2025-03-30
	description:	Lab 5 using php concepts
-->

<?php include 'headerM.php'; ?>

<main>
	<div class="results">
    <div class="results__caption">Movie Information Saved</div>
	<table class="results__table">
        <tr><td class="results__label">Title:</td><td><?php echo htmlspecialchars($title); ?></td></tr>
        <tr><td class="results__label">Description:</td><td><?php echo htmlspecialchars($description); ?></td></tr>         
		<tr><td class="results__label">Genre:</td><td><?php echo htmlspecialchars($genre); ?></td></tr>
        <tr><td class="results__label">Subject:</td><td><?php echo htmlspecialchars($subject); ?></td></tr>
        <tr><td class="results__label">Star:</td><td><?php echo htmlspecialchars($star); ?></td></tr>
        <tr><td class="results__label">Year:</td><td><?php echo htmlspecialchars($year); ?></td></tr>
        <tr><td class="results__label">Production:</td><td><?php echo htmlspecialchars($production); ?></td></tr>
        <tr><td class="results__label">Director:</td><td><?php echo htmlspecialchars($director); ?></td></tr>
    </table>
	</div>
</main>

<?php include 'footerM.php'; ?>

</body>
</html>