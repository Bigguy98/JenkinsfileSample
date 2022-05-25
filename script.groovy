def exampleMethod() {
    //do something
}
def otherExampleMethod() {
    //do something else
}

def buildingApp() {
    echo "Building app ${params.APP_NAME} with ${BUILD_TOOL}"
}
def deployApp() {
    echo "Deploying app ${params.APP_NAME} version ${params.VERSION} to env ${ENV}"
}
return this