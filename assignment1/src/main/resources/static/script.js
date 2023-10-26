document.addEventListener("DOMContentLoaded", function() {
    const currentDate = new Date();
    const dateInput = document.getElementById("date");

    // Format the date as YYYY-MM-DD
    const formattedDate = currentDate.toISOString().slice(0, 10);

    dateInput.value = formattedDate;
});
