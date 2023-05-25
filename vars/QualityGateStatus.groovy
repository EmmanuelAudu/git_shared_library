def call(credentialsId){
timeout(time: 1, unit: 'MINUTES')
waitForQualityGate abortPipeline: false, credentialsId: credentialsId
    
}
