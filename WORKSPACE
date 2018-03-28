workspace(name = "play_scala_rest_api_example_bazel")

# update version as needed
rules_play_routes_version = "cba8a4383d81e6519730ba2b0203f74fd2c9b765"
http_archive(
  name = "io_bazel_rules_play_routes",
  url = "https://github.com/lucidsoftware/rules_play_routes/archive/%s.zip"%rules_play_routes_version,
  type = "zip",
  strip_prefix= "rules_play_routes-%s" % rules_play_routes_version
)

# update version as needed
rules_scala_version = "24bc74b2664560fdba27b31da9e6c529dd231e1e"
http_archive(
  name = "io_bazel_rules_scala",
  url = "https://github.com/bazelbuild/rules_scala/archive/%s.zip"%rules_scala_version,
  type = "zip",
  strip_prefix= "rules_scala-%s" % rules_scala_version
)

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
scala_repositories()

load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains")
scala_register_toolchains()

maven_jar(name = "aopalliance_aopalliance", artifact = "aopalliance:aopalliance:1.0")
maven_jar(name = "ch_qos_logback_logback_classic", artifact = "ch.qos.logback:logback-classic:1.2.3")
maven_jar(name = "ch_qos_logback_logback_core", artifact = "ch.qos.logback:logback-core:1.2.3")
maven_jar(name = "com_chuusai_shapeless", artifact = "com.chuusai:shapeless_2.11:2.1.0")
maven_jar(name = "com_fasterxml_jackson_core_jackson_annotations", artifact = "com.fasterxml.jackson.core:jackson-annotations:2.7.8")
maven_jar(name = "com_fasterxml_jackson_core_jackson_core", artifact = "com.fasterxml.jackson.core:jackson-core:2.7.8")
maven_jar(name = "com_fasterxml_jackson_core_jackson_databind", artifact = "com.fasterxml.jackson.core:jackson-databind:2.7.8")
maven_jar(name = "com_fasterxml_jackson_datatype_jackson_datatype_jdk8", artifact = "com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.7.8")
maven_jar(name = "com_fasterxml_jackson_datatype_jackson_datatype_jsr310", artifact = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.7.8")
maven_jar(name = "com_google_code_findbugs_jsr305", artifact = "com.google.code.findbugs:jsr305:3.0.1")
maven_jar(name = "com_google_guava_guava", artifact = "com.google.guava:guava:19.0")
maven_jar(name = "com_google_inject_extensions_guice_assistedinject", artifact = "com.google.inject.extensions:guice-assistedinject:4.0")
maven_jar(name = "com_google_inject_extensions_guice_multibindings", artifact = "com.google.inject.extensions:guice-multibindings:4.1.0")
maven_jar(name = "com_google_inject_guice", artifact = "com.google.inject:guice:4.1.0")
maven_jar(name = "com_netaporter_scala_uri", artifact = "com.netaporter:scala-uri_2.11:0.4.14")
maven_jar(name = "com_typesafe_akka_akka_actor", artifact = "com.typesafe.akka:akka-actor_2.11:2.4.20")
maven_jar(name = "com_typesafe_akka_akka_slf4j", artifact = "com.typesafe.akka:akka-slf4j_2.11:2.4.20")
maven_jar(name = "com_typesafe_akka_akka_stream", artifact = "com.typesafe.akka:akka-stream_2.11:2.4.20")
maven_jar(name = "com_typesafe_netty_netty_reactive_streams_http", artifact = "com.typesafe.netty:netty-reactive-streams-http:1.0.8")
maven_jar(name = "com_typesafe_netty_netty_reactive_streams", artifact = "com.typesafe.netty:netty-reactive-streams:1.0.8")
maven_jar(name = "com_typesafe_play_build_link", artifact = "com.typesafe.play:build-link:2.5.18")
maven_jar(name = "com_typesafe_play_play_datacommons", artifact = "com.typesafe.play:play-datacommons_2.11:2.5.18")
maven_jar(name = "com_typesafe_play_play_exceptions", artifact = "com.typesafe.play:play-exceptions:2.5.18")
maven_jar(name = "com_typesafe_play_play_functional", artifact = "com.typesafe.play:play-functional_2.11:2.5.18")
maven_jar(name = "com_typesafe_play_play_iteratees", artifact = "com.typesafe.play:play-iteratees_2.11:2.5.18")
maven_jar(name = "com_typesafe_play_play_json", artifact = "com.typesafe.play:play-json_2.11:2.5.18")
maven_jar(name = "com_typesafe_play_play_logback", artifact = "com.typesafe.play:play-logback_2.11:2.5.18")
maven_jar(name = "com_typesafe_play_play_netty_server", artifact = "com.typesafe.play:play-netty-server_2.11:2.5.18")
maven_jar(name = "com_typesafe_play_play_netty_utils", artifact = "com.typesafe.play:play-netty-utils:2.5.18")
maven_jar(name = "com_typesafe_play_play_server", artifact = "com.typesafe.play:play-server_2.11:2.5.18")
maven_jar(name = "com_typesafe_play_play_streams", artifact = "com.typesafe.play:play-streams_2.11:2.5.18")
maven_jar(name = "com_typesafe_play_play_2_11", artifact = "com.typesafe.play:play_2.11:2.5.18")
maven_jar(name = "com_typesafe_play_twirl_api_2_11", artifact = "com.typesafe.play:twirl-api_2.11:1.1.1")
maven_jar(name = "com_typesafe_config", artifact = "com.typesafe:config:1.3.1")
maven_jar(name = "com_typesafe_ssl_config_core", artifact = "com.typesafe:ssl-config-core_2.11:0.2.1")
maven_jar(name = "commons_codec_commons_codec", artifact = "commons-codec:commons-codec:1.10")
maven_jar(name = "io_netty_netty_buffer", artifact = "io.netty:netty-buffer:4.0.51.Final")
maven_jar(name = "io_netty_netty_codec_http", artifact = "io.netty:netty-codec-http:4.0.41.Final")
maven_jar(name = "io_netty_netty_codec", artifact = "io.netty:netty-codec:4.0.41.Final")
maven_jar(name = "io_netty_netty_common", artifact = "io.netty:netty-common:4.0.51.Final")
maven_jar(name = "io_netty_netty_handler", artifact = "io.netty:netty-handler:4.0.41.Final")
maven_jar(name = "io_netty_netty_transport_native_epoll", artifact = "io.netty:netty-transport-native-epoll:4.0.51.Final")
maven_jar(name = "io_netty_netty_transport", artifact = "io.netty:netty-transport:4.0.51.Final")
maven_jar(name = "io_spray_spray_json", artifact = "io.spray:spray-json_2.11:1.3.2")
maven_jar(name = "javax_inject_javax_inject", artifact = "javax.inject:javax.inject:1")
maven_jar(name = "javax_transaction_jta", artifact = "javax.transaction:jta:1.1")
maven_jar(name = "joda_time_joda_time", artifact = "joda-time:joda-time:2.9.6")
maven_jar(name = "net_codingwell_scala_guice", artifact = "net.codingwell:scala-guice_2.11:4.1.0")
maven_jar(name = "org_apache_commons_commons_lang3", artifact = "org.apache.commons:commons-lang3:3.4")
maven_jar(name = "org_joda_joda_convert", artifact = "org.joda:joda-convert:1.8.1")
maven_jar(name = "org_parboiled_parboiled", artifact = "org.parboiled:parboiled_2.11:2.1.0")
maven_jar(name = "org_reactivestreams_reactive_streams", artifact = "org.reactivestreams:reactive-streams:1.0.0")
maven_jar(name = "org_scala_lang_modules_scala_java8_compat", artifact = "org.scala-lang.modules:scala-java8-compat_2.11:0.7.0")
maven_jar(name = "org_scala_lang_modules_scala_parser_combinators", artifact = "org.scala-lang.modules:scala-parser-combinators_2.11:1.0.4")
maven_jar(name = "org_scala_lang_modules_scala_xml", artifact = "org.scala-lang.modules:scala-xml_2.11:1.0.1")
maven_jar(name = "org_scala_lang_scala_reflect", artifact = "org.scala-lang:scala-reflect:2.11.11")
maven_jar(name = "org_scala_stm_scala_stm", artifact = "org.scala-stm:scala-stm_2.11:0.7")
maven_jar(name = "org_slf4j_jcl_over_slf4j", artifact = "org.slf4j:jcl-over-slf4j:1.7.21")
maven_jar(name = "org_slf4j_jul_to_slf4j", artifact = "org.slf4j:jul-to-slf4j:1.7.21")
maven_jar(name = "org_slf4j_slf4j_api", artifact = "org.slf4j:slf4j-api:1.7.25")
maven_jar(name = "xerces_xercesImpl", artifact = "xerces:xercesImpl:2.11.0")
maven_jar(name = "xml_apis_xml_apis", artifact = "xml-apis:xml-apis:1.4.01")

#For play_routes_compiler.
#Take care of "name". Should match the names expected by play_routes_compiler.
maven_jar(name = "commons_io_commons_io", artifact = "commons-io:commons-io:2.4")
maven_jar(name = "com_typesafe_play_routes_compiler_2_11", artifact = "com.typesafe.play:routes-compiler_2.11:jar:2.5.18")
maven_jar(name = "com_github_scopt_scopt_2_11", artifact = "com.github.scopt:scopt_2.11:jar:3.7.0")
