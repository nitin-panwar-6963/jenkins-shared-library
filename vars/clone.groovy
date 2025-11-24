def call(String url , String branch){
  echo "cloning the code ......"
  sh "sleep 5s"
  git branch: '${branch}' , url: '${url}'
  echo "cloning is succesfull ......"
}
