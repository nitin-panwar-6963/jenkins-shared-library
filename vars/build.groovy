def call(String image){
  echo "build your custom image...."
  sh "sleep 5s"
  sh "docker build -t $(image) . "
  echo "your image is buil succesfully...."
