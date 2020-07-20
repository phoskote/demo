Kubernetes        -> https://www.youtube.com/watch?v=1xo-0gCVhTU
Parallel tests    -> https://www.youtube.com/watch?v=oQWxfVbFwjY 

Install Java:
sudo apt install openjdk-8-jdk-headless

Install Docker:
sudo docker pull selenium/hub
sudo docker pull selenium/node-chrome-debug

Install docker:
sudo apt install docker

Install Jenkins:
wget -q -O - https://pkg.jenkins.io/debian/jenkins.io.key | sudo apt-key add -
sudo sh -c 'echo deb https://pkg.jenkins.io/debian binary/ > \
    /etc/apt/sources.list.d/jenkins.list'
sudo apt-get update
sudo apt-get install jenkins
