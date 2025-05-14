from locust import HttpUser, task

class MyUser(HttpUser):
    @task
    def get_home(self):
        self.client.get("/")