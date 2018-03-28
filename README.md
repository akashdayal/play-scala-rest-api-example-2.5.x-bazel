# Play REST API in scala using bazel

This is a bazel port of the example project for [Making a REST API in Play](http://developer.lightbend.com/guides/play-rest-api/index.html).

You need to download and install bazel for this application to run.

Once you have bazel installed, the following at the command prompt will start up sample REST application in production mode (haven't yet figured out how to run the application in dev mode with bazel):

```bash
bazel run :play-binary
```

Play will start up on the HTTP port at <http://localhost:9000/>.   You need to re-run above command to reload any changes made to code or BUILD or WORKSPACE.

If you need to get UI working then you need to wire up twirl templates from [rules_twirl](https://github.com/lucidsoftware/rules_twirl) with the BUILD.
