from . import views
from django.conf.urls import urls


urlpatterns = [
    urls(r'^$', views.index, name='index')
]
