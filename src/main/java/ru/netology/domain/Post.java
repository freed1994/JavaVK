package ru.netology.domain;

public class Post {
    private int id;   //идентификатор записи
    private int ownerId;   //идент.владельца стены, на которой размещен пост
    private int fromId;   //идент.автора записи
    private int postDate;   //дата время публикации записи
    private String postText;   //текст записи
    private CommentsInfo commentsInfo;   //комментарии к записи
    private CopyrightsInfo copyrightsInfo;   //источник материала
    private LikesInfo likesInfo;   //лайки к записи
    private RepostsInfo repostInfo;    //репосты к записи
    private ViewsInfo viewsInfo;   //просмотры записи
    private String postType;   //тип записи
    private GeoInfo geolocationInfo;   //местоположение
    private int photoId;   //идентификатор изображения
    private int deletePost;   //удалить пост
    private int editPost;  //редактировать пост
    private int saveToBookmarks; //сохранить пост в закладках
    private int complain; //пожаловаться на пост
    private int toTheCollection; //добавить в коллекцию
}