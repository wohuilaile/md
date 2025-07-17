#### 常用Git命令
- 初始化仓库
git init

- 克隆仓库
git clone <仓库地址>

- 查看状态
git status

- 添加文件到暂存区
git add <文件名>
git add .         # 添加所有文件

- 提交更改
git commit -m "提交说明"

- 查看提交历史
git log

- 查看分支
git branch

- 创建新分支
git branch <分支名>

- 切换分支
git checkout <分支名>

- 合并分支
git merge <分支名>

- 删除分支
git branch -d <分支名>

- 推送到远程仓库
git push

- 拉取远程仓库
git pull

- 远程仓库地址管理
git remote -v
git remote add origin <仓库地址>
git remote remove origin

- 查看差异
git diff

- 撤销修改
git checkout -- <文件名>
git reset HEAD <文件名>