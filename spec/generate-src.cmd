java -Dfile.encoding=utf-8 -jar swagger-codegen\modules\swagger-codegen-cli\target\swagger-codegen-cli.jar generate -i api.yaml -l swagger -o generated
java -Dfile.encoding=utf-8 -jar swagger-codegen\modules\swagger-codegen-cli\target\swagger-codegen-cli.jar generate -i generated\swagger.json -l html -o generated\html
java -Dfile.encoding=utf-8 -jar swagger-codegen\modules\swagger-codegen-cli\target\swagger-codegen-cli.jar generate -i generated\swagger.json -l jaxrs-resteasy -o generated\resteasy -c ..\modules\spender-server\swagger-config.json
