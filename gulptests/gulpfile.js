var gulp = require('gulp');
var gulpGalen = require('gulp-galenframework');

gulp.task('test:galen', function() {
  gulp.src('tests/*.js').pipe(gulpGalen.test(
    {
    htmlreport: "reports/{relative}",
    }
  ));
});

gulp.task('default', ['test:galen']);
