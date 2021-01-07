# springboot-rabbitmq-producer-consumer
Test project for demonstrating producer and consumer of messages using RabbitMQ and Sprint Boot

# RabbitMQ Installation in Windows

    1.	Download and install ERlang http://erlang.org/download/otp_win64_22.3.exe
    2.	Downlaod and install RabbitMQ https://github.com/rabbitmq/rabbitmq-server/releases/download/v3.8.8/rabbitmq-server-3.8.8.exe
    3.	Go to RabbitMQ Server install Directory C:\Program Files\RabbitMQ Server\rabbitmq_server-3.8.3\sbin
    4.	Run command rabbitmq-plugins enable rabbitmq_management
    5.	Open browser and enter http://localhost:15672/ to redirect to RabbitMQ Dashboard
    6.	Also we can Open it with IP Address http://127.0.0.1:15672
    7.	Login page default username and password is guest
    8.	After successfully login you should see RabbitMQ Home page

# RabbitMQ Dashboard

![image-text](screenshots/1_rabbitmq_dashboard.png)

# Start the rabbitmq-producer application

![image-text](screenshots/2_rabbitmq_producer_started_application.png)

# Publishing Messages to RabbitMQ Publisher API via Postman

![image-text](screenshots/3_rabbitmq_publisher_postman_request.png)

# Published Message in the RabbitMQ Queue

![image-text](screenshots/4_rabbitmq_published_message_in_queue.png)

# Start the rabbitmq-consumer application & message received

![image-text](screenshots/5_rabbitmq_consumer_received_the_message.png)
