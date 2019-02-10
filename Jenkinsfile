node{
  stage('push'){
    properties([pipelineTriggers([githubPush()])])
  }
stage('SCM Checkout'){
git 'https://github.com/PuvvadaNaveen/pipeline_jenkins'
}
stage('Compile-Package'){
sh 'mvn compile'
}
}
