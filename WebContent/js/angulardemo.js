
    var app = angular.module("employeeApp", []);
    app.controller("employeeController", function($scope,$http) {
        $http({
            url: "spike2/FetchDataServlet",
            method:"GET"
        }).then(function(response){
            console.log(response);

        }, function(response){
            console.log(response);
        });
    });