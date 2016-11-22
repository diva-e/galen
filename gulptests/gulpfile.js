var gulp = require('gulp');
var gulpGalen = require('gulp-galenframework');

gulp.task('test', function() {
  console.log("Gulp-Test gestartet");
  gulp.src('tests/*.test').pipe(gulpGalen.test(
    {
    htmlreport: "reports/{relative}",
    }
  ));

});

gulp.task('default', ['test:galen']);
