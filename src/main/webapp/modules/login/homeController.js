(function () {
    'use strict';
 
    angular
        .module('app')
        .controller('LoginController', LoginController);
    vm.userObj = {
            "username": "",
            "password": ""
        };

 
        function login() {
        	 var url;
       	  url = "http://localhost:8080/inventoryManager/login";
       		alert(url);
       		console.log(vm.userObj);
           $http.post(url, vm.userObj).success(function (response) {
           	
               $state.go('results');
           }).error(function (err) {
               //alert("some error has occured");
               //alert(err.message);
               $state.go('results');
           });
        }

}
})