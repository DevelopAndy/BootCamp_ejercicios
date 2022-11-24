from django.urls import re_path as urls
from . import views


urlpatterns = [
    urls(r'^$', views.index, name='index')
]
