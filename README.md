## コンポーネント粒度について

<img width=250 src="https://github.com/user-attachments/assets/505cdd5d-7584-49b5-85b7-21a0923570c4"/>

`Screen`, `Section`, `Component`の三つのレベルに分類している

- Screen : `MainScreen`や`MainViewModel`などが属する
- Section : `ArticleContent`などが属する
- Component : `ArticleItem`などが属する

依存関係は`Screen → Section → Component`の一方向とする

