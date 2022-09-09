# Docker

### container commands:
* docker run [image-name] [override command] - pull image and run container (docker run = docker create + docker start)
* docker create [image-name] - creates container but does not start it
* docker start -a (watch an output) [container id]
* docker ps - list all running containers
* docker ps --all - history of containers
* docker system prune - remove containers
* docker logs <container id> - print logs of a container
* docker stop <container id>  
* docker kill <container id> - shut down right now!
* docker exec (run another command) -it (allow us to provide input to the container) <container id> <command> - execute an additional command in a container
* docker exec -it <container id> sh|powershell|zsh|bash - run shell of the container to get rid of docker exec prefix every time
* docker run -it busybox sh - start container with a shell

### image commands:
* docker build . (dot is build context) - builds image from Dockerfile

* To create redis image and run container we need to craete Dockerfile with commands in it:

FROM alpine

RUN apk add --update redis

CMD ["redis-server"]
