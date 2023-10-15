data();
var variable = 'dasd';
function data() {
    console.log(variable);
    var variable = 'Name';
    console.log(variable);
    function data2() {
//        let variable = 'Name';
        console.log(variable);

    }
    data2();
}

console.log(variable)


console.log(this.variable);

