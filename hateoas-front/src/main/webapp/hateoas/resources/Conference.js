define([ 'modules/hateoasModule' ], function(hateoasModule) {
	hateoasModule.factory('Conference', function($resource, Constantes) {
		return $resource(Constantes.urlRoot+'conferences/:id', {
			id : '@id'
		});
	});
});