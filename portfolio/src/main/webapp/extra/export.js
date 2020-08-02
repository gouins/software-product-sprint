
var data = [
   ['Cat', 'Bat','12',],
   ['Dog', 'Dog','12','spelling?'],
   ['Moo', 'Moo']
];

var now = new Date();
var day = "" + now.getFullYear() + "-"+ now.getMonth() + "-" + now.getDate();

function download_csv() {
    var csv = 'Word,Answer,Frequency,Comments\n';
    data.forEach(function(row) {
            csv += row.join(',');
            csv += "\n";
    });
 
    console.log(csv);
    var hiddenElement = document.createElement('a');
    hiddenElement.href = 'data:text/csv;charset=utf-8,' + encodeURI(csv);
    hiddenElement.target = '_blank';
    hiddenElement.download = "Results-" + day + ".csv";
    hiddenElement.click();
}