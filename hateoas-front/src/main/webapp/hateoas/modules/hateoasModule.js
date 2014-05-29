define([ 'angular' ], function(angular) {

	var hateoasModule = angular.module('hateoas', [ 'ngRoute', 'ngResource', 'ui.bootstrap' ]);

	hateoasModule.value('Constantes', {
	    urlRoot: 'http://localhost:8080/hateoas-webservice/rs/'
	   
	});

	return hateoasModule;
});