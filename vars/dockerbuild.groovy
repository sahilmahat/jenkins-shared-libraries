def call(String imagename, String imageVersion){
  sh "docker build -t $imagename:$imageVersion ."
}
