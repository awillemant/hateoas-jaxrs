define([ 'modules/hateoasModule', 'controllers/ConferenceController'], function(mainApp) {

	return mainApp.config(function($routeProvider) {

		$routeProvider.when('/', {
			controller : 'ConferenceController',
			templateUrl : 'hateoas/templates/conferences.html'
		});

		

	});

});