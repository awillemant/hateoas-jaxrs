define([ 'angular' ], function(angular) {

	var hateoasModule = angular.module('hateoas', [ 'ngRoute', 'ngResource' ]);

	hateoasModule.value('Constantes', {
		urlRoot : 'http://localhost:8080/hateoas-webservice/rs/'

	});

	hateoasModule.factory('LinkUtils', function($log) {
		var utils = {
			getIndexForRel : function(obj, rel) {
				$log.debug("call for Linkutils");
				for (i in obj.links) {
					if (obj.links[i].rel == rel) {
						$log.debug(rel + " : " + i + " : " + obj.links[i].href);
						return i;
					}
					;
				}
				return -1;
			}
		};
		return utils;
	});

	return hateoasModule;
});