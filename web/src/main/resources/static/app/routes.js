footballSchoolApp.config(["$stateProvider", "$urlRouterProvider", function ($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise("/dashboard");
    $stateProvider
        .state("login", {
            url: "/login",
            templateUrl: "/app/modules/account/login.html",
            data: {pageTitle: "登陆"},
            controller: "app.login",
            resolve: {
                deps: [
                    "$ocLazyLoad",
                    function ($ocLazyLoad) {
                        return $ocLazyLoad.load({
                            name: appName,
                            serie: true,
                            insertBefore: "#ng_load_plugins_before",
                            files: [
                                "/app/modules/account/login.css",
                                "/app/modules/account/login.js"
                            ]
                        });
                    }
                ]
            }
        })
        .state("dashboard", {
            url: "/dashboard",
            templateUrl: "/app/dashboard/dashboard.html",
            data: {pageTitle: "dashboard"},
            controller: "app.dashboard",
            resolve: {
                deps: [
                    "$ocLazyLoad",
                    function ($ocLazyLoad) {
                        return $ocLazyLoad.load({
                            name: appName,
                            serie: true,
                            insertBefore: "#ng_load_plugins_before",
                            files: [
                                "/app/dashboard/dashboard.css",
                                "/app/dashboard/dashboard.js"
                            ]
                        });
                    }
                ]
            }
        })
}]);