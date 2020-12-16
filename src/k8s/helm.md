

## Helm



### Helm

```
/home/helm-charts/chatbot
[root@master chatbot]# helm delete chatbot-dev --purge
release "chatbot-dev" deleted
[root@master chatbot]# helm install -f values-dev.yml  --namespace dev --name chatbot-dev ./
[root@master chatbot]# kubectl get pods -n dev

[root@master chatbot]# vim templates/backend-deployment.yaml
```





### 草稿

```
  308  helm delete library-dev-api --purge
  309  kubectl get pods -n sit-dev-api
  310  helm install -f values-dev-api.yml  --namespace sit-dev-api --name library-dev-api ./
  311  ll
  312  helm install -f values-dev-api.yml  --namespace sit-dev-api --name library-dev-api ./
  313  ll
  314  helm install -f values-dev-api.yaml  --namespace sit-dev-api --name library-dev-api ./
  315  vi values-dev-api.yaml
  316  helm install -f values-dev-api.yaml  --namespace sit-dev-api --name library-dev-api ./
  317  ll
  318  cd ../library-test/
  319  ll
  320  helm delete library-dev-api --purge
  321  helm install -f values-dev-api.yaml  --namespace sit-dev-api --name library-dev-api ./
  322  clear
  323  ll
  324  vi values-dev-api.yaml 
  325  helm install -f values-dev-api.yaml  --namespace sit-dev-api --name library-dev-api ./
  326  helm delete library-dev-api --purge
  327  helm install -f values-dev-api.yaml  --namespace sit-dev-api --name library-dev-api ./
  328  kubectl get pods -n sit-dev-api
  329  kubectl describe po library-dev-api-distribute-c4db55769-kktb7  -n sit-dev-api
  330  kubectl get pods -n sit-dev-api
  331  kubectl get pods -n sit-dev-api|grep library
  332  kubectl get nodes -o wide
  333  kubectl get pods -n sit-dev-api|grep library
  334  kubectl describe po library-dev-api-distribute-c4db55769-kktb7  -n sit-dev-api
  335  kubectl get pods -n sit-dev-api|grep library
  336  helm delete library-dev-api --purge
  337  ll
  338  cd templates/
  339  ll
  340  vi preview-configmap.yaml 
  341  vi distribute-deployment.yaml
  342  cd ..
  343  clear
  344  helm delete library-dev-api --purge
  345  helm install -f values-dev-api.yaml  --namespace sit-dev-api --name library-dev-api ./
  346  kubectl get pods -n sit-dev-api|grep library
  347  kubectl logs library-dev-api-distribute-7955d9c5c9-x9r5c -n sit-dev-api
  348  ll
  349  vi values-dev-api.yaml 
  350  clear
  351  ll
  352  grep 10.6.209.46 -rl ./
  353  kubectl logs library-dev-api-distribute-7955d9c5c9-x9r5c -n sit-dev-api
  354  q!
  355  clear
  356  ll
  357  kubectl logs library-dev-api-distribute-7955d9c5c9-x9r5c -n sit-dev-api
  358  clear
  359  cd ..
  360  ll
  361  grep 10.6.209.46 -rl ./
  362   ll
  363  cd library-test
  364  clear
  365  ll
  366  kubectl logs library-dev-api-distribute-7955d9c5c9-x9r5c -n sit-dev-api
  367  clear
  368  ll
  369  vi values-dev-api.yaml 
  370  kubectl get pods -n dev|grep library
  371  ll
  372  kubectl get pods -n dev|grep library
  373  kubectl describe po library-dev-distribute-66d6d48744-wg2gc -n dev 
  374  kubectl get pods -n dev|grep library
  375  [root@master library-test]#
  376  cd ..
  377  ll
  378  cd library
  379  ll
  380  clear
  381  helm delete library-dev --purge
  382  [root@master library]#
  383  helm install -f values-dev.yaml  --namespace dev --name library-dev ./
  384  kubectl get pods -n dev|grep library
  385  kubectl logs library-dev-distribute-66d6d48744-f88nx -n dev
  386  cd ../library-test/
  387  clear
  388  ll
  389  helm delete library-dev-api --purge
  390  helm install -f values-dev-api.yml  --namespace sit-dev-api --name library-dev-api ./
  391  ll
  392  helm install -f values-dev-api.yaml  --namespace sit-dev-api --name library-dev-api ./
  393  kubectl get pods -n sit-dev-api|grep library
  394  kubectl get nodes -o wide
  395  kubectl get pods -n sit-dev-api|grep library
  396  kubectl describe po library-dev-api-distribute-7955d9c5c9-rvpgv -n sit-dev-api
  397  kubectl logs library-dev-api-distribute-7955d9c5c9-rvpgv -n sit-dev-api
  398  kubectl get nodes -o wide
  399  kubectl describe po library-dev-api-distribute-7955d9c5c9-rvpgv -n sit-dev-api
  400  kubectl get nodes -o wide
  401  ll
  402  grep 10.6.209.45 -rl ./
  403  grep 10.6.209.46 -rl ./
  404  kubectl logs library-dev-api-distribute-7955d9c5c9-rvpgv -n sit-dev-api
  405  kubectl get pods -n sit-dev-api|grep library
  406  helm delete library-dev-api --purge
  407  helm install -f values-dev-api.yaml  --namespace sit-dev-api --name library-dev-api ./
  408  kubectl get pods -n sit-dev-api|grep library
  409  kubectl describe po library-dev-api-distribute-7955d9c5c9-7nf5p  -n sit-dev-api
  410  kubectl logs library-dev-api-distribute-7955d9c5c9-7nf5p  -n sit-dev-api
  411  ls
  412  helm delete library-dev-api --purge
  413  clear
  414  helm delete library-dev-api --purge
  415  helm install -f values-dev-api.yaml  --namespace sit-dev-api --name library-dev-api ./
  416  kubectl get pods -n sit-dev-api|grep library
  417  kubectl logs library-dev-api-distribute-7955d9c5c9-xrhg6  -n sit-dev-api
  418  helm delete library-dev-api --purge
  419  helm install -f values-dev-api.yaml  --namespace sit-dev-api --name library-dev-api ./
  420  kubectl get pods -n sit-dev-api|grep library
  421  kubectl get pods -n sit-dev-api
  422  cd ..
  423  cd library
  424  pwd
  425  kubectl get pods -n sit-dev-api
  426  kubectl get pods -n sit-dev-api|grep library -w
  427  kubectl get pods -n sit-dev-api -w |grep library 
  428  kubectl get pods -n dev -w |grep library 
  429  kubectl get pods -n sit-dev-api -w |grep library 
  430  kubectl get pods -n sit-dev-api  |grep library 
  431  pwd
  432  cd ..
  433  ll
  434  cd /home/helm-charts/library-test
  435  ll
  436  kubectl get pods -n sit-dev-api -w |grep library 
  437  kubectl describe po library-dev-api-nginx-7f697f796d-kds9r   -n sit-dev-api
  438  ll
  439  cd templates/
  440  ll
  441  vi preview-configmap.yaml 
  442  cd ..
  443  helm delete library-dev-api --purge
  444  helm install -f values-dev-api.yaml  --namespace sit-dev-api --name library-dev-api ./
  445  kubectl get pods -n sit-dev-api -w |grep library 
  446  kubectl get pods -n sit-dev-api |grep library 
  447  clear
  448  kubectl get pods -n sit-dev-api |grep library 
  449  helm delete library-dev-api --purge
  450  cd ../
  451  cd library
  452  ll
  453  kubectl get nodes -o wide
  454  kubectl get pods -o wide
  455  kubectl get pods --all-namespace -o wide
  456  kubectl get pods --all-namespaces -o wide
  457  kubectl get pods --all-namespaces -o wide |grep node3
  458  kubectl get pods -o wide
  459  kubectl get pods --all-namespaces -o wide |grep node3
  460  kubectl get nodes -o wide
  461  kubectl get nodes
  462  kubectl get pods --all-namespaces 
  463  kubectl get pods --all-namespaces   -n dev
  464  kubectl get pods --all-namespaces   -n dev |grep uap
  465  kubectl get pods --all-namespaces   -n dev |grep uap
  466  kubectl get pods --all-namespaces   -n dev
  467  kubectl get pods --all-namespaces   -n dev |grep uap
  468  kubectl get pods   -n dev |grep uap
  469  kubectl get nodes
  470  kubectl get nodes -o wide
  471  clear
  472  ls
  473  kubectl get pods -n dev 
  474  kubectl get svc -n dev
  475  kubectl get svc -n dev|grep uap
  476  kubectl get pods -n dev -o wide |grep uap
  477  cd /home/helm-charts
  478  ls
  479  cd uap
  480  ls
  481  helm list  |grep uap
  482  helm delete uap --purge
  483  ls
  484  helm install -f values-dev.yaml  --name uap ./
  485  helm list
  486  helm list |grep uap
  487  ifconfig 
  488  kubectl get node -o wide 
  489  kubectl get node 
  490  systemctl restart kubelet
  491  kubectl get node 
  492  find / -name 403
  493  find / -name 403.html
  494  ssh 10.6.209.22
  495  ll
  496  scp root@10.6.209.22:/data/nfs/library-dev-html/403.html /home/hhy
  497  scp root@10.6.209.22:/data/nfs/library-dev-html/403.html /home/hhy/
  498  scp root@10.6.209.22:/data/nfs/library-dev-html/403.html /home/hejun
  499  scp root@10.6.209.22:/data/nfs/library-dev-html/403.h
  500  clear
  501  scp root@10.6.209.22:/data/nfs/library-dev-html/uplusDoc.html /home/hhydown
  502  scp root@10.6.209.22:/data/nfs/library-dev-html/watermark.js /home/hhydown
  503  scp root@10.6.209.22:/data/nfs/library-dev-html/403.html /home/hhydown
  504  scp root@10.6.209.22:/data/nfs/library-dev-html/50x.html /home/hhydown
  505  scp root@10.6.209.22:/data/nfs/library-dev-html/favicon.ico /home/hhydown
  506  scp root@10.6.209.22:/data/nfs/library-dev-html/jquery-3.5.1.min.js /home/hhydown
  507  kubectl get nodes
  508  kubectl get pods --all-namespaces
  509  kubectl get nodes
  510  kubectl get pods --all-namespaces
  511  kubectl top pod
  512  kubectl top pods
  513  kubectl top pods -n dev
  514  ssh 10.6.209.22
  515  scp -r /home/hhyup root@10.6.209.22:/data/nfs/library-dev-html/
  516  scp /home/hhyup/watermark.js root@10.6.209.22:/data/nfs/library-dev-html/
  517  /home/helm-charts/library
  518  cd  /home/helm-charts/library
  519  helm delete library-dev --purge
  520  helm install -f values-dev.yaml  --namespace dev --name library-dev ./
  521  cd  /home/helm-charts/library
  522  helm delete library-dev --purge
  523  helm install -f values-dev.yaml  --namespace dev --name library-dev ./
  524  cd  /home/helm-charts/library
  525  helm delete library-dev --purge
  526  helm install -f values-dev.yaml  --namespace dev --name library-dev ./
  527  helm delete library-dev --purge
  528  helm install -f values-dev.yaml  --namespace dev --name library-dev ./
  529  helm delete library-dev --purge
  530  helm install -f values-dev.yaml  --namespace dev --name library-dev ./
  531  helm delete library-dev --purge
  532  helm install -f values-dev.yaml  --namespace dev --name library-dev ./
  533  lscpu
  534  free -hm
  535  cd  /home/helm-charts/library
  536  helm delete library-dev --purge
  537   helm install -f values-dev.yaml  --namespace dev --name library-dev ./
  538  helm ls
  539  kubectl get svc --all-namespacess
  540  kubectl get svc --all-namespaces
  541  kubectl get svc -n dev
  542  kubectl get svc -n dev|grep 30210
  543  kubectl get svc -n dev|grep 3022\0
  544  kubectl get svc -n dev|grep 30220
  545  kubectl get svc -n dev|grep 30210
  546  ll
  547  cd /home
  548  l;l
  549  ll
  550  pwd
  551  cd helm-charts/
  552  ll
  553  cd solar
  554  ll
  555  more values-dev.yaml 
  556  docker ps
  557  kubectl get pods -n dev
  558  kubectl get ns
  559  kubectl get pods -n sit-dev-api
  560  kubectl get pods -n dev
  561  kubectl get ns
  562  kubectl get pods -n dev-test
  563  kubectl get pods -n dev
  564  kubectl get svc -n dev
  565  kubectl get svc -n dev|grep 30210
  566  kubectl get svc -n dev|grep 30220
  567  ll
  568  more values-dev.yaml 
  569  ifconfig
  570  kubectl get po -n dev | grep cloud
  571  kubectl describe po cloudstorage-feature-access-6b7f645897-nb55x -n dev
  572  docker pull registry.uih/com.uih.uplus/imagecloud-access:feature-389-20200728
  573  kubectl describe po imagecloud-dev-get-8657d8b5cb-mfq4n  -n dev
  574  docker pull registry.uih/com.uih.uplus/imagecloud_get
  575  cd  /home/helm-charts/library
  576  helm delete library-dev --purge
  577  helm install -f values-dev.yaml --namespace dev --name library-dev ./
  578  kubectl get node
  579  exit
  580  docker ps -l
  581  ping 10.3.34.153
  582  ls
  583  scp 10.3.14.228:/root/preview.tar ./
  584  ls
  585  docker load -i preview.tar 
  586  docker run -d --name preview -p 9877:80 preview:v1
  587  ls
  588  rm -rf preview.tar 
  589  ls
  590  cd /usr/local
  591  ls
  592  mkdir preview
  593  rm -rf preview/
  594  ls
  595  scp 10.3.14.228:/preview  /usr/local/
  596  scp -r 10.3.14.228:/preview  /usr/local/
  597  ls
  598  cd preview/
  599  ls
  600  vi nginx.conf 
  601  docker rm -rf preview
  602  docker rm -f preview
  603  docker build -t preview:v2 .
  604  docker pull registry.uih/library/openresty:v4
  605  history
  606  scp -r 10.3.14.228:/preview/openresty.tar  /usr/local/preview/
  607  ls
  608  docker load -i openresty.tar 
  609  history
  610  ls
  611  rm -rf openresty.tar 
  612  docker build -t preview:v2 .
  613  docker run -d --name preview -p 9866:80 preview:v1
  614  docker exec -it preview /bin/bash
  615  docker exec -it preview /bin/bash
  616  history
  617  cd /usr/local/preview/
  618  ls
  619  scp 10.3.14.228:/preview/index.html ./
  620  ls
  621  cd html
  622  ls
  623  mv ../index.html CT_CT111_v01_CHS/
  624  docker build -t preview:v3 .
  625  cd ..
  626  ls
  627  docker build -t preview:v3 .
  628  docker rm -f preview
  629  docker run -d --name  preview -p 9866:80 preview:v3
  630  docker ps -l
  631  docker logs preview
  632  ls
  633  vi nginx.conf 
  634  docker  rm -f preview
  635  docker build -t preview:v4 .
  636  docker run -d --name  preview -p 9866:80 preview:v4
  637  ls
  638  cd html
  639  ls
  640  cd CT_CT111_v01_CHS/
  641  ls
  642  cat index.html 
  643  cd /usr/local/preview/
  644  ls
  645  docker exec -it preview /bin/bash
  646  kubectl get ns
  647  kubectl get pods -n test
  648  kubectl get pods -n sit-dev-api
  649  ssh 10.6.209.22
  650  kubectl get pods -n sit-dev-api
  651  pwd
  652  cd /home/helm-charts/
  653  clear
  654  ll
  655  cd library
  656  ll
  657  clear
  658  ll
  659  pwd
  660  cd templates/
  661  ll
  662  vi distribute-deployment.yaml
  663  pwd
  664  cd ../../
  665  ll
  666  cd library-test
  667  clear
  668  ll
  669  vi values-dev-api.yaml
  670  pwd
  671  ll
  672  mv values-dev-api.yaml values-dev-api_bak.yaml 
  673  ll
  674  pwd
  675  ll
  676  helm delete library-dev-api --purge
  677  helm install -f values-dev-api.yaml  --namespace sit-dev-api --name library-dev-api ./
  678  kubectl get pods -n library-dev-api|grep library
  679  kubectl get pods -n sit-dev-api|grep library
  680  kubectl get po
  681  kubectl get po --all-namespaces | grep po
  682  kubectl get po --all-namespaces |  redis
  683  kubectl get po --all-namespaces |  grep redis
  684  kubectl get pods --all-namespaces
  685  kubectl get nodes
  686  kubectl get nodes -o wide
  687  kubectl get nodes
  688  kubectl get pods -o wide
  689  kubectl get pods -n dev
  690  kubectl get pods -o wide
  691  kubectl get pods -n dev
  692  ll
  693  cd ../
  694  ll
  695  kubectl get pods -o wide
  696  kubectl get nodes
  697  helm list
  698  kubectl get pods -n dev
  699  kubectl get pods -n dev -o wide
  700  kubectl get nodes -o wide
  701  kubectl delete node node3
  702  kubectl get nodes -o wide
  703  kubectl get pods -n dev -o wide
  704  kubectl get pods -n dev -o wide |grep uap
  705  kubectl get pods -n dev -o wide
  706  kubectl get pods -n dev -o wide |grep uap
  707  ls
  708  clear
  709  ls
  710  kubectl get nodes 
  711  journalctl -f -u kubelet
  712  kubectl get nodes -o wide
  713  ssh 10.6.209.46
  714  kubectl top pods -n dev
  715  kubectl top pods -n dev |grep uap
  716  ls
  717  kubectl get crds
  718  ls
  719  kubectl get svc --all-namespace |grep  30448
  720  kubectl get svc --all-namespaces |grep  30448
  721  kubectl get svc
  722  kubectl get svc --all-namespaces 
  723  netstat -ano |grep 30448
  724  kubectl get nodes
  725  kubectl get nodes -o wide
  726  kubectl get svc --all-namespaces |grep 30448
  727  kubectl get svc --all-namespaces 
  728  kubectl get svc --all-namespaces  |grep 30448
  729  kubectl get svc --all-namespaces  |grep istio-ingressgateway 
  730  kubectl get pods --all-namespaces |grep istio-system 
  731  kubectl get svc -n istio-system
  732  kubectl top pod -n dev
  733  kubectl describe limits
  734  kubectl describe limits -n dev
  735  clear
  736  ls
  737  clear
  738  cd /home/helm-charts
  739  ls
  740  ccd chatbot
  741  ls
  742  cd chatbot
  743  ls
  744  vi values-dev.yml 
  745  kubectl get svc -n dev
  746  kubectl get ns
  747  kubectl get svc -n sit-dev-api 
  748  ls
  749  vi values-dev.yml 
  750  ls
  751  kubectl get pod -n sit-dev-api
  752  kubectl logs -f chatbot-dev-api-front-bd4dc6bd9-lt6c6  -n sit-dev-api
  753  ls
  754  kubectl exec -it  chatbot-dev-api-front-bd4dc6bd9-lt6c6  /bin/sh -n sit-dev-api  
  755  ls
  756  cd ../
  757  cd -
  758  ls
  759  vi values-dev-api.yml 
  760  ls
  761  vi values-dev.yml 
  762  kubectl get nodes -o wide
  763  cd /home/helm-charts/
  764  ls
  765  cd library
  766  ls
  767  vim values-dev-api.yaml 
  768  mysql -h10.6.118.114 -uroot -p
  769  mysql
  770  ls
  771  python
  772  netstat -s | grep "SYNs to LISTEN"
  773  docker ps
  774  docker info
  775  curl https://registry-dev.uihcloud.cn/
  776  curl https://dockerhub.azk8s.cn/
  777  docker info
  778  cd /etc/docker/
  779  ls
  780  cat key.json 
  781  docker search mysql
  782  pwd
  783  ls
  784  cd certs.d/
  785  ls
  786  docker search mysql
  787  docker info
  788  cd /etc/default/
  789  ls
  790  cd /lib/systemd/system/
  791  ;s
  792  ls
  793  cat docker.service 
  794  curl -X get https://registry-dev.uihcloud.cn/
  795  curl -X get https://registry-dev.uihcloud.cn/v2/_catalog
  796  docker pull https://registry-dev.uihcloud.cn/library/mysql
  797  docker pull registry-dev.uihcloud.cn/library/mysql
  798  docker images
  799  cd /home/docker_file
  800  ll
  801  cd ..
  802  ll
  803  cd helm-charts/
  804  ll
  805  cd cloudstorage
  806  ll
  807  pwd
  808  cd /home/helm-charts/
  809  ll
  810  cd cloudstorage
  811  ll
  812  vim values-feature.yaml 
  813  helm delete cloudstorage-feature --purge
  814  helm install -f values-feature.yaml --set access.image.tag=feature-389-20200728 --set storage.image.tag=feature-389-20200728 --set retrieval.image.tag=feature-389-20200728 --set getdata.image.tag=feature-389-20200728 --set aeconfig.image.tag=feature-389-20200728 --set modifyimage.image.tag=feature-389-20200728 --set transport.image.tag=feature-389-20200728 --set transport.image.tag=feature-389-20200728 --namespace dev --name cloudstorage-feature ./
  815  helm delete cloudstorage-feature --purge
  816  helm install -f values-feature.yaml --set access.image.tag=feature-389-20200728 --set storage.image.tag=feature-389-20200728 --set retrieval.image.tag=feature-389-20200728 --set getdata.image.tag=feature-389-20200728 --set aeconfig.image.tag=feature-389-20200728 --set modifyimage.image.tag=feature-389-20200728 --set transport.image.tag=feature-389-20200728 --set transport.image.tag=feature-389-20200728 --namespace dev --name cloudstorage-feature ./
  817  vim values-feature.yaml 
  818  helm delete cloudstorage-feature --purge
  819  helm install -f values-feature.yaml --set access.image.tag=feature-391-20200728 --set storage.image.tag=feature-391-20200728 --set retrieval.image.tag=feature-391-20200728 --set getdata.image.tag=feature-391-20200728 --set aeconfig.image.tag=feature-391-20200728 --set modifyimage.image.tag=feature-391-20200728 --set transport.image.tag=feature-391-20200728 --set transport.image.tag=feature-391-20200728 --namespace dev --name cloudstorage-feature ./
  820  helm delete cloudstorage-feature --purge
  821  vim values-feature.yaml 
  822  helm install -f values-feature.yaml --set access.image.tag=feature-391-20200728 --set storage.image.tag=feature-391-20200728 --set retrieval.image.tag=feature-391-20200728 --set getdata.image.tag=feature-391-20200728 --set aeconfig.image.tag=feature-391-20200728 --set modifyimage.image.tag=feature-391-20200728 --set transport.image.tag=feature-391-20200728 --set transport.image.tag=feature-391-20200728 --namespace dev --name cloudstorage-feature ./
  823  helm delete cloudstorage-feature --purge
  824  kubectl get svc -n feature
  825  kubectl get svc -n dev
  826  kubectl get pods -n dev
  827  kubectl get svc -n dev | grep 30222
  828  netstat -ntl | grep 30220
  829  kubectl get svc -n dev
  830  kubectl get svc -n dev | grep 30222
  831  cd /home/helm-charts/solar
  832  helm delete solar --purge
  833  helm install -f values-dev.yaml --namespace dev --name solar ./ --set mgr.debug=true
  834  ll
  835  cd templates/
  836  ll
  837  vi solar-monitor-configmap.yaml
  838  vi solar-monitor-deployment.yaml
  839  cd ..
  840  helm delete solar --purge
  841  helm install -f values-dev.yaml --namespace dev --name solar ./ --set mgr.debug=true
  842  kubectl get svc -n dev | grep 30222
  843  ll
  844  vi values-dev.yaml
  845  cd templates/
  846  ll
  847  vi solar-monitor-service.yaml
  848  cd ..
  849  helm delete solar --purge
  850  helm install -f values-dev.yaml --namespace dev --name solar ./ --set mgr.debug=true
  851  helm install -f values-dev-api.yaml --namespace sit-dev-api --name solar-dev-api ./ --set mgr.debug=true
  852  helm delete solar-dev-api --purge
  853  helm install -f values-dev-api.yaml --namespace sit-dev-api --name solar-dev-api ./ --set mgr.debug=true
  854  cd templates/
  855  ll
  856  vi solar-logmigration-service.yaml
  857  cd ..
  858  helm delete solar --purge
  859  helm install -f values-dev.yaml --namespace dev --name solar ./ --set mgr.debug=true
  860  cd templates/
  861  ll
  862  vi solar-mgr-service.yaml
  863  cd ..
  864  helm delete solar --purge
  865  helm install -f values-dev.yaml --namespace dev --name solar ./ --set mgr.debug=true
  866  helm delete solar-dev-api --purge
  867  helm install -f values-dev-api.yaml --namespace sit-dev-api --name solar-dev-api ./ --set mgr.debug=true
  868  cd ..
  869  ll
  870  cp -r solar solar-api-test
  871  cd solar-api-test/
  872  ll
  873  cd templates/
  874  ll
  875  vi solar-mgr-service.yaml
  876  vi solar-logmigration-service.yaml
  877  vi solar-monitor-service.yaml
  878  cd ..
  879  helm delete solar-dev-api --purge
  880  helm install -f values-dev-api.yaml --namespace sit-dev-api --name solar-dev-api ./ --set mgr.debug=true
  881  cd templates/
  882  vi solar-alert-service.yaml
  883  cd ..
  884  helm delete solar-dev-api --purge
  885  helm install -f values-dev-api.yaml --namespace sit-dev-api --name solar-dev-api ./ --set mgr.debug=true
  886  cd templates/
  887  ll
  888  vi solar-loginquirer-service.yaml
  889  vi solar-loginquirer-deployment.yaml
  890  vi solar-loginquirer-configmap.yaml
  891  vi solar-logmigration-service.yaml
  892  vi solar-mgr-service.yaml
  893  cd ..
  894  helm delete solar-dev-api --purge
  895  helm install -f values-dev-api.yaml --namespace sit-dev-api --name solar-dev-api ./ --set mgr.debug=true
  896  ll
  897  vi values-dev-api.yaml
  898  helm delete solar-dev-api --purge
  899  helm install -f values-dev-api.yaml --namespace sit-dev-api --name solar-dev-api ./ --set mgr.debug=true
  900  vi values-dev-api.yaml
  901  helm delete solar-dev-api --purge
  902  helm install -f values-dev-api.yaml --namespace sit-dev-api --name solar-dev-api ./ --set mgr.debug=true
  903  cat values-dev-api.yaml
  904  vi values-dev-api.yaml
  905  rm values-dev-api.yaml
  906  vi values-dev-api.yaml
  907  helm delete solar-dev-api --purge
  908  helm install -f values-dev-api.yaml --namespace sit-dev-api --name solar-dev-api ./ --set mgr.debug=true
  909  kubectl get po --all-namespaces | grep solar
  910  kubectl get svc --all-namespaces | grep solar
  911  kubectl logs solar-dev-api-mgr -n sit-dev-api
  912  kubectl logs solar-dev-api-mgr-5d948df86b-zgnjn -n sit-dev-api
  913  kubectl get po --all-namespaces | grep solar
  914  kubectl logs solar-dev-api-mgr-5d948df86b-zgnjn -n sit-dev-api
  915  kubectl get logs solar-dev-api-mgr-5d948df86b-zgnjn -n sit-dev-api
  916  kubectl logs solar-dev-api-mgr-5d948df86b-zgnjn -n sit-dev-api
  917  kubectl logs solar-dev-api-alert-9954ccff5-dqt89 -n sit-dev-api
  918  kubectl logs solar-logparser-686f78674d-xjbwp -n sit-dev-api
  919  kubectl logs solar-logparser-686f78674d-xjbwp -n dev
  920  ll
  921  cat values-dev-api.yaml
  922  llkubectl get svc -n dev
  923  kubectl get svc -n dev
  924  cat values-dev.yaml 
  925  rm values-dev-api.yaml 
  926  vi values-dev-api.yaml 
  927  helm list | grep solar
  928  helm del solar-dev-api --purge
  929  history | grep helm
  930  helm install -f values-dev-api.yaml --namespace sit-dev-api --name solar-dev-api ./ --set mgr.debug=true
  931  rm values-dev-api.yaml 
  932  vi values-dev-api.yaml 
  933  helm del solar-dev-api --purge
  934  helm install -f values-dev-api.yaml --namespace sit-dev-api --name solar-dev-api ./ --set mgr.debug=true
  935  cd /home/helm-charts/solar-api-test
  936  ll
  937  cat values-dev-api.yaml
  938  rm values-dev-api.yaml
  939  vi values-dev-api.yaml
  940  helm delete solar-dev-api --purge
  941  helm install -f values-dev-api.yaml --namespace sit-dev-api --name solar-dev-api ./ --set mgr.debug=true
  942  ll
  943  cat values-dev-api.yaml 
  944  helm delete solar-dev-api --purge
  945  helm install -f values-dev-api.yaml --namespace sit-dev-api --name solar-dev-api ./ --set mgr.debug=true
  946  vi values-dev-api.yaml 
  947  helm delete solar-dev-api --purge
  948  helm install -f values-dev-api.yaml --namespace sit-dev-api --name solar-dev-api ./ --set mgr.debug=true
  949  cd  /home/helm-charts/library
  950  helm delete library-dev --purge
  951  helm install -f values-dev.yaml  --namespace dev --name library-dev ./
  952  cd  /home/helm-charts/library
  953  helm delete library-dev --purge
  954  helm install -f values-dev.yaml  --namespace dev --name library-dev ./
  955  kubectl get pod -n dev|grep library
  956  cd /home/
  957  ls
  958  cd /root/
  959  ls
  960  cd kubesphere-all-offline-v2.1.1/
  961  ls
  962  cd conf/
  963  ls
  964  vi hosts.ini
  965  vim hosts.ini
  966  ls
  967  cd /mnt/
  968  ls
  969  cd registry/
  970  ls
  971  cd docker/
  972  ls
  973  cd registry/
  974  ls
  975  cd v2/
  976  ls
  977  cd repositories/
  978  ls
  979  cd ..
  980  ls
  981  cd ..
  982  ls
  983  exit
  984  ls
  985  exit
  986  kubectl get pod -n test
  987  kubectl get pod -n test -o wide
  988  docker inspect test-libsdk-commonlib-backend-6dc6c85779-57d4v
  989  kubectl inspect test-libsdk-commonlib-backend-6dc6c85779-57d4v -n test
  990  kubectl describe test-libsdk-commonlib-backend-6dc6c85779-57d4v -n test
  991  cd /home/
  992  ll
  993  cd helm-charts/
  994  ll
  995  cd commonlib/
  996  ll
  997  vim values.yaml
  998  docker push registry.uih/library/uidgenerator:v1.1.5 
  999  kubectl get pod -n test -o wide
 1000  cd /home/helm-charts/chatbot
 1001  ll
 1002  cd templates/
 1003  ll
 1004  vi backend-deployment.yaml
 1005  history
[root@master templates]# cd ..
[root@master chatbot]# ls
0.0,  Chart.yaml  README.md  templates  values-dev-api.yml  values-dev-copy.yml  values-dev.yml  values-test.yaml  values-ui.yaml  values.yaml
[root@master chatbot]# pwd
/home/helm-charts/chatbot
[root@master chatbot]# helm delete chatbot-dev --purge
release "chatbot-dev" deleted
[root@master chatbot]# helm install -f values-dev.yml  --namespace dev --name chatbot-dev ./
NAME:   chatbot-dev
LAST DEPLOYED: Wed Jul 29 15:51:19 2020
NAMESPACE: dev
STATUS: DEPLOYED

RESOURCES:
==> v1/ConfigMap
NAME                        DATA  AGE
chatbot-dev-backend-config  1     1s
chatbot-dev-front-config    1     1s

==> v1/Deployment
NAME                 READY  UP-TO-DATE  AVAILABLE  AGE
chatbot-dev-backend  0/2    2           0          1s
chatbot-dev-front    0/2    2           0          1s

==> v1/Pod(related)
NAME                                  READY  STATUS             RESTARTS  AGE
chatbot-dev-backend-855f8b64f6-hpn7h  0/1    ContainerCreating  0         1s
chatbot-dev-backend-855f8b64f6-ssbnm  0/1    ContainerCreating  0         1s
chatbot-dev-front-64fd9df68d-8z8bt    0/1    ContainerCreating  0         1s
chatbot-dev-front-64fd9df68d-cxhgk    0/1    ContainerCreating  0         1s
chatbot-dev-front-64fd9df68d-g2txw    1/1    Terminating        0         45m
chatbot-dev-front-64fd9df68d-pwvnv    1/1    Terminating        0         45m

==> v1/Service
NAME                 TYPE      CLUSTER-IP     EXTERNAL-IP  PORT(S)         AGE
chatbot-dev-backend  NodePort  10.233.39.119  <none>       8086:30201/TCP  1s
chatbot-dev-front    NodePort  10.233.33.86   <none>       80:30200/TCP    1s


NOTES:
1. Get the application URL by running these commands:
  export NODE_PORT=$(kubectl get --namespace dev -o jsonpath="{.spec.ports[0].nodePort}" services chatbot-dev)
  export NODE_IP=$(kubectl get nodes --namespace dev -o jsonpath="{.items[0].status.addresses[0].address}")
  echo http://$NODE_IP:$NODE_PORT

[root@master chatbot]# kubectl get pods -n dv
^C
[root@master chatbot]# kubectl get pods -n dev
NAME                                                    READY   STATUS              RESTARTS   AGE
calling-bizserver-57f477f754-qf85n                      1/1     Running             0          3h15m
calling-configserver-8f8b96b77-gphxt                    1/1     Running             0          3h15m
calling-front-5db84f6445-8vwl8                          1/1     Running             0          3h15m
calling-gatewayserver-55c7fc5584-qzcxl                  1/1     Running             0          3h15m
chatbot-dev-backend-855f8b64f6-hpn7h                    0/1     CrashLoopBackOff    1          21s
chatbot-dev-backend-855f8b64f6-ssbnm                    0/1     CrashLoopBackOff    1          21s
chatbot-dev-front-64fd9df68d-8z8bt                      1/1     Running             0          21s
chatbot-dev-front-64fd9df68d-cxhgk                      1/1     Running             0          21s
cloudstorage-feature-access-76c9fdbf6b-kp7zr            1/1     Running             0          5h37m
cloudstorage-feature-aeconfig-5f96c5d47-vtqbw           1/1     Running             0          5h37m
cloudstorage-feature-getdata-7f447f7d44-rvfpz           1/1     Running             0          5h37m
cloudstorage-feature-modifyimage-5485fffbd4-k44qw       1/1     Running             0          5h37m
cloudstorage-feature-retrieval-68cf646d8c-mln9l         1/1     Running             0          5h37m
cloudstorage-feature-storage-7bd79699b4-8rbws           1/1     Running             0          5h37m
cloudstorage-feature-transport-5b5b5fd8b8-vrvfk         1/1     Running             1          5h37m
imagecloud-dev-get-8657d8b5cb-mfq4n                     1/1     Running             0          6d
imagecloud-dev-upload-7545fd78b7-fjxnf                  1/1     Running             0          6d
library-dev-admin-54484bd698-stblw                      1/1     Running             0          41m
library-dev-client-7fbbd9bbd8-rzcwp                     1/1     Running             0          41m
library-dev-distribute-66d6d48744-tqxlt                 1/1     Running             0          41m
library-dev-nginx-7464b79cbf-4smth                      1/1     Running             0          41m
miniprogram-drawboard-web-9c4d679cb-fg2j9               1/1     Running             0          78m
solar-alert-7dd7c65dd4-fkg98                            1/1     Running             0          5h37m
solar-front-54689cd7bb-bpz4t                            1/1     Running             0          5h37m
solar-loginquirer-d755d6c5-44nl9                        1/1     Running             0          5h37m
solar-logmigration-6d957f8686-chqq6                     1/1     Running             0          5h37m
solar-logparser-686f78674d-bmt9x                        1/1     Running             0          5h37m
solar-logreceiver-79d99f77b7-8dvb8                      1/1     Running             0          5h37m
solar-mgr-54585779b7-9kh9m                              1/1     Running             0          5h37m
solar-monitor-7665ff44c-wvmbm                           1/1     Running             0          5h37m
sysconfig-dev-commonconfig-5678dddf95-fmwdv             0/1     ContainerCreating   0          22h
sysconfig-dev-commonconfig-7d6649fbb8-b96t2             0/1     Error               0          47d
sysconfig-dev-frontconfig-c69655f7b-jwxvr               1/1     Running             6          48d
tie-engine-adaptationserver-6564f8cd64-rkb5j            1/1     Running             0          5h37m
tie-engine-configureserver-6466fcd9d-njlx5              1/1     Running             0          5h37m
tie-engine-dbintegrateserver-f8d4874f-822tw             1/1     Running             0          5h37m
tie-engine-restintegrateserver-b5f974c84-v9mdc          1/1     Running             0          5h37m
tie-engine-socketintegrateserver-595f45997-ntdw8        1/1     Running             0          5h37m
tie-engine-tiefrontweb-744f5765-jrzxd                   1/1     Running             0          5h37m
tie-engine-webserviceintegrateserver-688bbf4d68-wjqkg   1/1     Running             0          5h37m
uap-admin-auth-server-77fc47ffc9-cj6nd                  1/1     Running             0          78m
uap-admin-portal-api-69d58649b9-ts8kn                   1/1     Running             0          78m
uap-admin-portal-web-65bcfb8b58-pphsc                   1/1     Running             0          78m
uap-auth-server-5c4c994db9-7gdfm                        1/1     Running             0          78m
uap-portal-api-7c8b456b9f-hh8d2                         1/1     Running             0          78m
uap-portal-web-8569b7464b-4r98b                         1/1     Running             0          78m
[root@master chatbot]# kubectl get pods -n dev
NAME                                                    READY   STATUS              RESTARTS   AGE
calling-bizserver-57f477f754-qf85n                      1/1     Running             0          3h15m
calling-configserver-8f8b96b77-gphxt                    1/1     Running             0          3h15m
calling-front-5db84f6445-8vwl8                          1/1     Running             0          3h15m
calling-gatewayserver-55c7fc5584-qzcxl                  1/1     Running             0          3h15m
chatbot-dev-backend-855f8b64f6-hpn7h                    0/1     Error               2          28s
chatbot-dev-backend-855f8b64f6-ssbnm                    0/1     Error               2          28s
chatbot-dev-front-64fd9df68d-8z8bt                      1/1     Running             0          28s
chatbot-dev-front-64fd9df68d-cxhgk                      1/1     Running             0          28s
cloudstorage-feature-access-76c9fdbf6b-kp7zr            1/1     Running             0          5h37m
cloudstorage-feature-aeconfig-5f96c5d47-vtqbw           1/1     Running             0          5h37m
cloudstorage-feature-getdata-7f447f7d44-rvfpz           1/1     Running             0          5h37m
cloudstorage-feature-modifyimage-5485fffbd4-k44qw       1/1     Running             0          5h37m
cloudstorage-feature-retrieval-68cf646d8c-mln9l         1/1     Running             0          5h37m
cloudstorage-feature-storage-7bd79699b4-8rbws           1/1     Running             0          5h37m
cloudstorage-feature-transport-5b5b5fd8b8-vrvfk         1/1     Running             1          5h37m
imagecloud-dev-get-8657d8b5cb-mfq4n                     1/1     Running             0          6d
imagecloud-dev-upload-7545fd78b7-fjxnf                  1/1     Running             0          6d
library-dev-admin-54484bd698-stblw                      1/1     Running             0          41m
library-dev-client-7fbbd9bbd8-rzcwp                     1/1     Running             0          41m
library-dev-distribute-66d6d48744-tqxlt                 1/1     Running             0          41m
library-dev-nginx-7464b79cbf-4smth                      1/1     Running             0          41m
miniprogram-drawboard-web-9c4d679cb-fg2j9               1/1     Running             0          78m
solar-alert-7dd7c65dd4-fkg98                            1/1     Running             0          5h37m
solar-front-54689cd7bb-bpz4t                            1/1     Running             0          5h37m
solar-loginquirer-d755d6c5-44nl9                        1/1     Running             0          5h37m
solar-logmigration-6d957f8686-chqq6                     1/1     Running             0          5h37m
solar-logparser-686f78674d-bmt9x                        1/1     Running             0          5h37m
solar-logreceiver-79d99f77b7-8dvb8                      1/1     Running             0          5h37m
solar-mgr-54585779b7-9kh9m                              1/1     Running             0          5h37m
solar-monitor-7665ff44c-wvmbm                           1/1     Running             0          5h37m
sysconfig-dev-commonconfig-5678dddf95-fmwdv             0/1     ContainerCreating   0          22h
sysconfig-dev-commonconfig-7d6649fbb8-b96t2             0/1     Error               0          47d
sysconfig-dev-frontconfig-c69655f7b-jwxvr               1/1     Running             6          48d
tie-engine-adaptationserver-6564f8cd64-rkb5j            1/1     Running             0          5h37m
tie-engine-configureserver-6466fcd9d-njlx5              1/1     Running             0          5h37m
tie-engine-dbintegrateserver-f8d4874f-822tw             1/1     Running             0          5h37m
tie-engine-restintegrateserver-b5f974c84-v9mdc          1/1     Running             0          5h37m
tie-engine-socketintegrateserver-595f45997-ntdw8        1/1     Running             0          5h37m
tie-engine-tiefrontweb-744f5765-jrzxd                   1/1     Running             0          5h37m
tie-engine-webserviceintegrateserver-688bbf4d68-wjqkg   1/1     Running             0          5h37m
uap-admin-auth-server-77fc47ffc9-cj6nd                  1/1     Running             0          78m
uap-admin-portal-api-69d58649b9-ts8kn                   1/1     Running             0          78m
uap-admin-portal-web-65bcfb8b58-pphsc                   1/1     Running             0          78m
uap-auth-server-5c4c994db9-7gdfm                        1/1     Running             0          78m
uap-portal-api-7c8b456b9f-hh8d2                         1/1     Running             0          78m
uap-portal-web-8569b7464b-4r98b                         1/1     Running             0          78m
[root@master chatbot]# kubectl get pods -n dev
NAME                                                    READY   STATUS              RESTARTS   AGE
calling-bizserver-57f477f754-qf85n                      1/1     Running             0          3h15m
calling-configserver-8f8b96b77-gphxt                    1/1     Running             0          3h15m
calling-front-5db84f6445-8vwl8                          1/1     Running             0          3h15m
calling-gatewayserver-55c7fc5584-qzcxl                  1/1     Running             0          3h15m
chatbot-dev-backend-855f8b64f6-hpn7h                    0/1     Error               2          31s
chatbot-dev-backend-855f8b64f6-ssbnm                    0/1     Error               2          31s
chatbot-dev-front-64fd9df68d-8z8bt                      1/1     Running             0          31s
chatbot-dev-front-64fd9df68d-cxhgk                      1/1     Running             0          31s
cloudstorage-feature-access-76c9fdbf6b-kp7zr            1/1     Running             0          5h37m
cloudstorage-feature-aeconfig-5f96c5d47-vtqbw           1/1     Running             0          5h37m
cloudstorage-feature-getdata-7f447f7d44-rvfpz           1/1     Running             0          5h37m
cloudstorage-feature-modifyimage-5485fffbd4-k44qw       1/1     Running             0          5h37m
cloudstorage-feature-retrieval-68cf646d8c-mln9l         1/1     Running             0          5h37m
cloudstorage-feature-storage-7bd79699b4-8rbws           1/1     Running             0          5h37m
cloudstorage-feature-transport-5b5b5fd8b8-vrvfk         1/1     Running             1          5h37m
imagecloud-dev-get-8657d8b5cb-mfq4n                     1/1     Running             0          6d
imagecloud-dev-upload-7545fd78b7-fjxnf                  1/1     Running             0          6d
library-dev-admin-54484bd698-stblw                      1/1     Running             0          41m
library-dev-client-7fbbd9bbd8-rzcwp                     1/1     Running             0          41m
library-dev-distribute-66d6d48744-tqxlt                 1/1     Running             0          41m
library-dev-nginx-7464b79cbf-4smth                      1/1     Running             0          41m
miniprogram-drawboard-web-9c4d679cb-fg2j9               1/1     Running             0          79m
solar-alert-7dd7c65dd4-fkg98                            1/1     Running             0          5h37m
solar-front-54689cd7bb-bpz4t                            1/1     Running             0          5h37m
solar-loginquirer-d755d6c5-44nl9                        1/1     Running             0          5h37m
solar-logmigration-6d957f8686-chqq6                     1/1     Running             0          5h37m
solar-logparser-686f78674d-bmt9x                        1/1     Running             0          5h37m
solar-logreceiver-79d99f77b7-8dvb8                      1/1     Running             0          5h37m
solar-mgr-54585779b7-9kh9m                              1/1     Running             0          5h37m
solar-monitor-7665ff44c-wvmbm                           1/1     Running             0          5h37m
sysconfig-dev-commonconfig-5678dddf95-fmwdv             0/1     ContainerCreating   0          22h
sysconfig-dev-commonconfig-7d6649fbb8-b96t2             0/1     Error               0          47d
sysconfig-dev-frontconfig-c69655f7b-jwxvr               1/1     Running             6          48d
tie-engine-adaptationserver-6564f8cd64-rkb5j            1/1     Running             0          5h37m
tie-engine-configureserver-6466fcd9d-njlx5              1/1     Running             0          5h37m
tie-engine-dbintegrateserver-f8d4874f-822tw             1/1     Running             0          5h37m
tie-engine-restintegrateserver-b5f974c84-v9mdc          1/1     Running             0          5h37m
tie-engine-socketintegrateserver-595f45997-ntdw8        1/1     Running             0          5h37m
tie-engine-tiefrontweb-744f5765-jrzxd                   1/1     Running             0          5h37m
tie-engine-webserviceintegrateserver-688bbf4d68-wjqkg   1/1     Running             0          5h37m
uap-admin-auth-server-77fc47ffc9-cj6nd                  1/1     Running             0          79m
uap-admin-portal-api-69d58649b9-ts8kn                   1/1     Running             0          79m
uap-admin-portal-web-65bcfb8b58-pphsc                   1/1     Running             0          79m
uap-auth-server-5c4c994db9-7gdfm                        1/1     Running             0          79m
uap-portal-api-7c8b456b9f-hh8d2                         1/1     Running             0          79m
uap-portal-web-8569b7464b-4r98b                         1/1     Running             0          79m
[root@master chatbot]# kubectl get pods -n dev
NAME                                                    READY   STATUS              RESTARTS   AGE
calling-bizserver-57f477f754-qf85n                      1/1     Running             0          3h15m
calling-configserver-8f8b96b77-gphxt                    1/1     Running             0          3h15m
calling-front-5db84f6445-8vwl8                          1/1     Running             0          3h15m
calling-gatewayserver-55c7fc5584-qzcxl                  1/1     Running             0          3h15m
chatbot-dev-backend-855f8b64f6-hpn7h                    0/1     Error               2          32s
chatbot-dev-backend-855f8b64f6-ssbnm                    0/1     Error               2          32s
chatbot-dev-front-64fd9df68d-8z8bt                      1/1     Running             0          32s
chatbot-dev-front-64fd9df68d-cxhgk                      1/1     Running             0          32s
cloudstorage-feature-access-76c9fdbf6b-kp7zr            1/1     Running             0          5h37m
cloudstorage-feature-aeconfig-5f96c5d47-vtqbw           1/1     Running             0          5h37m
cloudstorage-feature-getdata-7f447f7d44-rvfpz           1/1     Running             0          5h37m
cloudstorage-feature-modifyimage-5485fffbd4-k44qw       1/1     Running             0          5h37m
cloudstorage-feature-retrieval-68cf646d8c-mln9l         1/1     Running             0          5h37m
cloudstorage-feature-storage-7bd79699b4-8rbws           1/1     Running             0          5h37m
cloudstorage-feature-transport-5b5b5fd8b8-vrvfk         1/1     Running             1          5h37m
imagecloud-dev-get-8657d8b5cb-mfq4n                     1/1     Running             0          6d
imagecloud-dev-upload-7545fd78b7-fjxnf                  1/1     Running             0          6d
library-dev-admin-54484bd698-stblw                      1/1     Running             0          41m
library-dev-client-7fbbd9bbd8-rzcwp                     1/1     Running             0          41m
library-dev-distribute-66d6d48744-tqxlt                 1/1     Running             0          41m
library-dev-nginx-7464b79cbf-4smth                      1/1     Running             0          41m
miniprogram-drawboard-web-9c4d679cb-fg2j9               1/1     Running             0          79m
solar-alert-7dd7c65dd4-fkg98                            1/1     Running             0          5h37m
solar-front-54689cd7bb-bpz4t                            1/1     Running             0          5h37m
solar-loginquirer-d755d6c5-44nl9                        1/1     Running             0          5h37m
solar-logmigration-6d957f8686-chqq6                     1/1     Running             0          5h37m
solar-logparser-686f78674d-bmt9x                        1/1     Running             0          5h37m
solar-logreceiver-79d99f77b7-8dvb8                      1/1     Running             0          5h37m
solar-mgr-54585779b7-9kh9m                              1/1     Running             0          5h37m
solar-monitor-7665ff44c-wvmbm                           1/1     Running             0          5h37m
sysconfig-dev-commonconfig-5678dddf95-fmwdv             0/1     ContainerCreating   0          22h
sysconfig-dev-commonconfig-7d6649fbb8-b96t2             0/1     Error               0          47d
sysconfig-dev-frontconfig-c69655f7b-jwxvr               1/1     Running             6          48d
tie-engine-adaptationserver-6564f8cd64-rkb5j            1/1     Running             0          5h37m
tie-engine-configureserver-6466fcd9d-njlx5              1/1     Running             0          5h37m
tie-engine-dbintegrateserver-f8d4874f-822tw             1/1     Running             0          5h37m
tie-engine-restintegrateserver-b5f974c84-v9mdc          1/1     Running             0          5h37m
tie-engine-socketintegrateserver-595f45997-ntdw8        1/1     Running             0          5h37m
tie-engine-tiefrontweb-744f5765-jrzxd                   1/1     Running             0          5h37m
tie-engine-webserviceintegrateserver-688bbf4d68-wjqkg   1/1     Running             0          5h37m
uap-admin-auth-server-77fc47ffc9-cj6nd                  1/1     Running             0          79m
uap-admin-portal-api-69d58649b9-ts8kn                   1/1     Running             0          79m
uap-admin-portal-web-65bcfb8b58-pphsc                   1/1     Running             0          79m
uap-auth-server-5c4c994db9-7gdfm                        1/1     Running             0          79m
uap-portal-api-7c8b456b9f-hh8d2                         1/1     Running             0          79m
uap-portal-web-8569b7464b-4r98b                         1/1     Running             0          79m
[root@master chatbot]# kubectl get pods -n dev
NAME                                                    READY   STATUS              RESTARTS   AGE
calling-bizserver-57f477f754-qf85n                      1/1     Running             0          3h15m
calling-configserver-8f8b96b77-gphxt                    1/1     Running             0          3h15m
calling-front-5db84f6445-8vwl8                          1/1     Running             0          3h15m
calling-gatewayserver-55c7fc5584-qzcxl                  1/1     Running             0          3h15m
chatbot-dev-backend-855f8b64f6-hpn7h                    0/1     Error               2          33s
chatbot-dev-backend-855f8b64f6-ssbnm                    0/1     Error               2          33s
chatbot-dev-front-64fd9df68d-8z8bt                      1/1     Running             0          33s
chatbot-dev-front-64fd9df68d-cxhgk                      1/1     Running             0          33s
cloudstorage-feature-access-76c9fdbf6b-kp7zr            1/1     Running             0          5h37m
cloudstorage-feature-aeconfig-5f96c5d47-vtqbw           1/1     Running             0          5h37m
cloudstorage-feature-getdata-7f447f7d44-rvfpz           1/1     Running             0          5h37m
cloudstorage-feature-modifyimage-5485fffbd4-k44qw       1/1     Running             0          5h37m
cloudstorage-feature-retrieval-68cf646d8c-mln9l         1/1     Running             0          5h37m
cloudstorage-feature-storage-7bd79699b4-8rbws           1/1     Running             0          5h37m
cloudstorage-feature-transport-5b5b5fd8b8-vrvfk         1/1     Running             1          5h37m
imagecloud-dev-get-8657d8b5cb-mfq4n                     1/1     Running             0          6d
imagecloud-dev-upload-7545fd78b7-fjxnf                  1/1     Running             0          6d
library-dev-admin-54484bd698-stblw                      1/1     Running             0          41m
library-dev-client-7fbbd9bbd8-rzcwp                     1/1     Running             0          41m
library-dev-distribute-66d6d48744-tqxlt                 1/1     Running             0          41m
library-dev-nginx-7464b79cbf-4smth                      1/1     Running             0          41m
miniprogram-drawboard-web-9c4d679cb-fg2j9               1/1     Running             0          79m
solar-alert-7dd7c65dd4-fkg98                            1/1     Running             0          5h37m
solar-front-54689cd7bb-bpz4t                            1/1     Running             0          5h37m
solar-loginquirer-d755d6c5-44nl9                        1/1     Running             0          5h37m
solar-logmigration-6d957f8686-chqq6                     1/1     Running             0          5h37m
solar-logparser-686f78674d-bmt9x                        1/1     Running             0          5h37m
solar-logreceiver-79d99f77b7-8dvb8                      1/1     Running             0          5h37m
solar-mgr-54585779b7-9kh9m                              1/1     Running             0          5h37m
solar-monitor-7665ff44c-wvmbm                           1/1     Running             0          5h37m
sysconfig-dev-commonconfig-5678dddf95-fmwdv             0/1     ContainerCreating   0          22h
sysconfig-dev-commonconfig-7d6649fbb8-b96t2             0/1     Error               0          47d
sysconfig-dev-frontconfig-c69655f7b-jwxvr               1/1     Running             6          48d
tie-engine-adaptationserver-6564f8cd64-rkb5j            1/1     Running             0          5h37m
tie-engine-configureserver-6466fcd9d-njlx5              1/1     Running             0          5h37m
tie-engine-dbintegrateserver-f8d4874f-822tw             1/1     Running             0          5h37m
tie-engine-restintegrateserver-b5f974c84-v9mdc          1/1     Running             0          5h37m
tie-engine-socketintegrateserver-595f45997-ntdw8        1/1     Running             0          5h37m
tie-engine-tiefrontweb-744f5765-jrzxd                   1/1     Running             0          5h37m
tie-engine-webserviceintegrateserver-688bbf4d68-wjqkg   1/1     Running             0          5h37m
uap-admin-auth-server-77fc47ffc9-cj6nd                  1/1     Running             0          79m
uap-admin-portal-api-69d58649b9-ts8kn                   1/1     Running             0          79m
uap-admin-portal-web-65bcfb8b58-pphsc                   1/1     Running             0          79m
uap-auth-server-5c4c994db9-7gdfm                        1/1     Running             0          79m
uap-portal-api-7c8b456b9f-hh8d2                         1/1     Running             0          79m
uap-portal-web-8569b7464b-4r98b                         1/1     Running             0          79m
[root@master chatbot]# vim templates/
backend-configmap.yaml       backend-deployment.yaml.bak  front-configmap.yaml         front-ingress.yaml           _helpers.tpl                 
backend-deployment.yaml      backend-service.yaml         front-deployment.yaml        front-service.yaml           NOTES.txt                    
[root@master chatbot]# vim templates/
backend-configmap.yaml       backend-deployment.yaml.bak  front-configmap.yaml         front-ingress.yaml           _helpers.tpl                 
backend-deployment.yaml      backend-service.yaml         front-deployment.yaml        front-service.yaml           NOTES.txt                    
[root@master chatbot]# vim templates/backend-deployment.yaml
[root@master chatbot]# helm delete chatbot-dev --purge
release "chatbot-dev" deleted
[root@master chatbot]# helm install -f values-dev.yml  --namespace dev --name chatbot-dev ./
NAME:   chatbot-dev
LAST DEPLOYED: Wed Jul 29 15:54:47 2020
NAMESPACE: dev
STATUS: DEPLOYED

RESOURCES:
==> v1/ConfigMap
NAME                        DATA  AGE
chatbot-dev-backend-config  1     1s
chatbot-dev-front-config    1     1s

==> v1/Deployment
NAME                 READY  UP-TO-DATE  AVAILABLE  AGE
chatbot-dev-backend  0/2    2           0          1s
chatbot-dev-front    0/2    2           0          1s

==> v1/Pod(related)
NAME                                  READY  STATUS             RESTARTS  AGE
chatbot-dev-backend-59547f45b7-dcrrr  0/1    Pending            0         1s
chatbot-dev-backend-59547f45b7-gnsq5  0/1    ContainerCreating  0         1s
chatbot-dev-backend-855f8b64f6-hpn7h  0/1    Terminating        5         3m29s
chatbot-dev-front-64fd9df68d-8z8bt    1/1    Terminating        0         3m29s
chatbot-dev-front-64fd9df68d-cxhgk    1/1    Terminating        0         3m29s
chatbot-dev-front-64fd9df68d-tbdhl    0/1    ContainerCreating  0         1s
chatbot-dev-front-64fd9df68d-v8sqq    0/1    ContainerCreating  0         1s

==> v1/Service
NAME                 TYPE      CLUSTER-IP     EXTERNAL-IP  PORT(S)         AGE
chatbot-dev-backend  NodePort  10.233.49.232  <none>       8086:30201/TCP  1s
chatbot-dev-front    NodePort  10.233.13.184  <none>       80:30200/TCP    1s


NOTES:
1. Get the application URL by running these commands:
  export NODE_PORT=$(kubectl get --namespace dev -o jsonpath="{.spec.ports[0].nodePort}" services chatbot-dev)
  export NODE_IP=$(kubectl get nodes --namespace dev -o jsonpath="{.items[0].status.addresses[0].address}")
  echo http://$NODE_IP:$NODE_PORT

[root@master chatbot]# vim templates/backend-deployment.yaml
[root@master chatbot]# helm list
NAME                         	REVISION	UPDATED                 	STATUS  	CHART                      	APP VERSION                 	NAMESPACE                
auth-temp                    	1       	Sun Jun 28 12:54:44 2020	DEPLOYED	auth-0.1.0                 	1.0                         	temp                     
calling                      	1       	Wed Jul 29 12:36:31 2020	DEPLOYED	calling-0.1.0              	1.0                         	dev                      
calling-dev                  	1       	Mon Apr 13 11:29:45 2020	FAILED  	calling-0.1.0              	1.0                         	dev                      
chatbot-dev                  	1       	Wed Jul 29 15:54:47 2020	DEPLOYED	chatbot-0.1.0              	1.0                         	dev                      
chatbot-dev-api              	1       	Wed Jul 29 10:49:30 2020	DEPLOYED	chatbot-0.1.0              	1.0                         	sit-dev-api              
cloudstorage-feature         	1       	Wed Jul 29 02:08:03 2020	DEPLOYED	cloudstorage-0.1.0         	1.0                         	dev                      
elasticsearch-logging        	1       	Thu Mar 26 14:20:02 2020	DEPLOYED	elasticsearch-1.22.1       	6.7.0-0217                  	kubesphere-logging-system
elasticsearch-logging-curator	1       	Thu Mar 26 14:20:03 2020	DEPLOYED	elasticsearch-curator-1.3.3	5.5.4-0217                  	kubesphere-logging-system
elasticsearch-logging-kibana 	1       	Thu Mar 26 14:20:04 2020	DEPLOYED	kibana-2.2.1               	6.7.0-0217                  	kubesphere-logging-system
imagecloud-dev               	1       	Tue Jun 23 10:49:11 2020	DEPLOYED	imagecloud-0.1.0           	1.0                         	dev                      
istio                        	1       	Thu Mar 26 14:21:16 2020	DEPLOYED	istio-1.3.3                	1.3.3                       	istio-system             
istio-init                   	1       	Thu Mar 26 14:20:53 2020	DEPLOYED	istio-init-1.3.2           	1.3.2                       	istio-system             
jaeger-operator              	1       	Thu Mar 26 14:21:21 2020	DEPLOYED	jaeger-operator-2.9.0      	1.13.1                      	istio-system             
ks-jenkins                   	18      	Fri Jul 10 15:23:09 2020	DEPLOYED	jenkins-0.19.0             	2.121.3-0217                	kubesphere-devops-system 
ks-minio                     	1       	Thu Mar 26 14:18:47 2020	DEPLOYED	minio-2.5.16               	RELEASE.2019-08-07T01-59-21Z	kubesphere-system        
ks-openldap                  	1       	Thu Mar 26 14:18:39 2020	DEPLOYED	openldap-ha-0.1.0          	1.0                         	kubesphere-system        
ks-openpitrix                	1       	Thu Mar 26 14:19:56 2020	DEPLOYED	openpitrix-0.1.0           	v0.4.8                      	openpitrix-system        
library-dev                  	1       	Wed Jul 29 15:10:10 2020	DEPLOYED	library-0.1.0              	1.0                         	dev                      
library-dev-api              	1       	Wed Jul 29 15:55:17 2020	DEPLOYED	library-0.1.0              	1.0                         	sit-dev-api              
logging-fluentbit-operator   	1       	Thu Mar 26 14:19:58 2020	DEPLOYED	fluentbit-operator-0.1.0   	0.1.0-0217                  	kubesphere-logging-system
metrics-server               	1       	Thu Mar 26 14:29:00 2020	DEPLOYED	metrics-server-2.5.0       	0.3.1-0217                  	kube-system              
solar                        	1       	Wed Jul 29 00:08:58 2020	DEPLOYED	solar-0.1.0                	1.0                         	dev                      
solar-dev-api                	1       	Wed Jul 29 07:25:37 2020	DEPLOYED	solar-0.1.0                	1.0                         	sit-dev-api              
sysconfig-dev                	1       	Wed Apr 15 20:37:42 2020	DEPLOYED	sysconfig-0.1.0            	1.0                         	dev                      
test-libsdk                  	1       	Wed Jun 24 14:44:15 2020	DEPLOYED	commonlib-0.1.0            	1.0                         	test                     
tie-engine                   	1       	Wed Jul 29 04:40:28 2020	DEPLOYED	tie-engine-0.1.0           	1.0                         	dev                      
uap-dev                      	1       	Wed Jul 29 14:32:48 2020	DEPLOYED	uap-1                      	R14.2                       	dev                      
uap-dev-publish              	1       	Tue Jul 28 14:17:48 2020	DEPLOYED	uap-1                      	R14.2                       	dev-publish              
uc                           	1       	Thu Mar 26 14:19:52 2020	DEPLOYED	jenkins-update-center-0.8.0	2.1.1                       	kubesphere-devops-system 
[root@master chatbot]# vim templates/backend-deployment.yaml
[root@master chatbot]# ls
0.0,  Chart.yaml  README.md  templates  values-dev-api.yml  values-dev-copy.yml  values-dev.yml  values-test.yaml  values-ui.yaml  values.yaml
[root@master chatbot]# 
[root@master chatbot]# 
[root@master chatbot]# 
[root@master chatbot]# ll
total 32
-rw-r--r--. 1 root root    0 Apr 26 17:26 0.0,
-rw-r--r--. 1 root root  189 Mar 26 13:58 Chart.yaml
-rw-r--r--. 1 root root  680 Mar 26 13:58 README.md
drwxr-xr-x. 2 root root  276 Jul 29 15:57 templates
-rw-r--r--. 1 root root 3801 Jul 29 13:37 values-dev-api.yml
-rw-r--r--. 1 root root 2194 Mar 26 21:25 values-dev-copy.yml
-rw-r--r--. 1 root root 3882 Jul 29 13:37 values-dev.yml
-rw-r--r--. 1 root root 2299 Mar 26 13:58 values-test.yaml
-rw-r--r--. 1 root root 2293 Mar 26 13:58 values-ui.yaml
-rw-r--r--. 1 root root 2293 Mar 26 13:58 values.yaml
[root@master chatbot]# 

```





*