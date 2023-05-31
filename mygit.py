"""
安装git
yum install git
git 版本控制工具 分布式代码管理工具 分布式就是 一个程序同时部署在多个服务器上
svn 版本控制工具 集中式代码管理工具就是只有一个中央服务器
git配置：
系统配置 对所有用户进行配置 配置文件在 /etc/gitconfig
sudo git config --system user.name lyw

用户配置 只对当前用户进行配置 配置文件在 ~/.gitconfig
git config --global user.name lyw user.email 670214362@qq.com

项目配置 只对当前项目进行配置 配置文件在 当前项目/.git/config
先执行 git init 生成 当前项目/.git
再执行 git config user.name lyw
git init ----在当前工作路径下创建git仓库
git status -----查看当前git分支 重要 常用
git add -----添加要被管理的代码文件  只是添加到暂存当中
git rm --cached readme.md  撤回 add readme.md
git commit [files] -m [备注信息 最好字母] 提交到本地仓库
git log  查看提交日志
git diff mygit.py  -----查看当前mygit.py 与仓库中的 mygit.py 的区别
git checkout -- filename -----将仓库中的filename恢复到当前项目
git mv file path 移动文件 暂存
git rm gile 删除文件 暂存
git reflog 查看所有日志
git reset -- file 撤回对文件的暂存操作
git reset --hard HEAD^^ 退回两步提交之前的版本
git reset --hard 前七位版本号  跳到任意版本
git tag [tagname] [commit_id] -m [message]------给特定的节点添加标签 commit_id 就是某一次commit 操作后的版本号也就是版本节点
git tag -----查看所有标签
git show tagname 查看某个标签详细信息
git reset --hard tagname ------直接跳转到标签版本
git branch --------查看分支情况 * 代表当前工作分支
git branch 分支名 --------创建分支 当前分支是哪个就是在哪个分支创建子分支
git checkout 分支名------------切换分支
git merge 分支名 将分支合并到当前分支
git branch -d|D 分支名------删除分支
git clone https://github.com/acheong08/ChatGPT.git 从远程仓库github下载到本地仓库
git remote add javaProject https://github.com/liyanwei135642/javaProject.git ---添加远程仓库PythonStudy
git remote rm origin  ------删除已添加的远程仓库origin
git push -u PythonStudy master ------PythonStudy 远程仓库名随便设置 master要上传的分支 -u 首次上传
git push --force PythonStudy branch_name ------PythonStudy 远程仓库名随便设置 master要上传的分支 --force本地版本低于远程版本时强行推送
push 上传密码失败 一共三次上传，第一次密码 第二次token 第三次还是token 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
忘记token找回方法 setting->developer setting->person access token ->classic->全选
git branch -a -----查看所有分支包括远程仓库分支
git push 给远程仓库提交更新
git push PythonStudy --tags-----远程仓库同步所有标签
git push  PythonStudy tagname(标签名) -----上传一个标签
git push -u PythonStudy lyw-----推送lyw分支到远程仓库
git push PythonStudy --delete [branch_name] 删除远程仓库分支
git push PythonStudy : [branch_name] 删除远程仓库分支
git push PythonStudy --delete tag [tag_name] 删除远程仓库标签
git pull( | fetch) PythonStudy [branch_name](:tmp)-----从远程仓库PythonStudy 拉取对应分支到本地 如果用fetch tmp 代表本地新分支
github 中删除仓库 进入自己的仓库 点击 setting 拉到最下面 delete this repository


"""