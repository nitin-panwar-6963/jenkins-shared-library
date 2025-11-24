def call(){
  echo "your app deployment is starting...."
  sh "sleep 5s"
  sh "docker compose up -d "
  echo "your app is deploy succesfull"
}
