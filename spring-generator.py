import urllib.request
import json
import os 

url = os.environ.get('OLLAMA_URL_LOCAL')

data = json.dumps({
    "model": "llama3",
    "prompt": "Create a Spring Boot REST controller",
    "stream": False
}).encode("utf-8")

req = urllib.request.Request(url, data=data, headers={"Content-Type": "application/json"})

with urllib.request.urlopen(req) as res:
    print(json.loads(res.read())["response"])
