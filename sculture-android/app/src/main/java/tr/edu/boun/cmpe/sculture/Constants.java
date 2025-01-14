package tr.edu.boun.cmpe.sculture;

/**
 * A class which contains constants.
 */
public class Constants {
    //API URLS
    private static final String API_BASE_URL = BuildConfig.API_BASE_URL;
    public static final String API_USER_LOGIN = API_BASE_URL + "/user/login";
    public static final String API_USER_REGISTER = API_BASE_URL + "/user/register";
    public static final String API_STORY_GET = API_BASE_URL + "/story/get";
    public static final String API_STORY_CREATE = API_BASE_URL + "/story/create";
    public static final String API_SEARCH = API_BASE_URL + "/search";
    public static final String API_COMMENT_LIST = API_BASE_URL + "/comment/list";
    public static final String API_COMMENT_GET = API_BASE_URL + "/comment/get";
    public static final String API_COMMENT_EDIT = API_BASE_URL + "/comment/edit";
    public static final String API_STORY_EDIT = API_BASE_URL + "/story/edit";
    public static final String API_STORY_DELETE = API_BASE_URL + "/story/delete";
    public static final String API_USER_STORIES = API_BASE_URL + "/user/stories";
    public static final String API_COMMENT_NEW = API_BASE_URL + "/comment/new";
    public static final String API_STORY_REPORT = API_BASE_URL + "/story/report";
    public static final String API_STORY_VOTE = API_BASE_URL + "/story/vote";
    public static final String API_TAG_GET = API_BASE_URL + "/tag/get";
    public static final String API_TAG_CREATE = API_BASE_URL + "/tag/create";
    public static final String API_TAG_EDIT = API_BASE_URL + "/tag/edit";
    public static final String API_USER_GET = API_BASE_URL + "/user/get";
    public static final String API_USER_FOLLOW = API_BASE_URL + "/user/follow";
    public static final String API_IMAGE_GET = API_BASE_URL + "/image/get/";
    public static final String API_IMAGE_UPLOAD = API_BASE_URL + "/image/upload";
    public static final String API_RECOMMENDATION_FOLLOW = API_BASE_URL + "/recommendation/fromFollowedUser";
    public static final String API_RECOMMENDATION_TRENDING = API_BASE_URL + "/recommendation/trending";
    public static final String API_RECOMMENDATION_SIMILIAR = API_BASE_URL + "/recommendation/similarToLiked";

    //REQUEST TAGS
    public static final String REQUEST_TAG_LOGIN = "request_login";
    public static final String REQUEST_TAG_REGISTER = "request_register";
    public static final String REQUEST_TAG_SEARCH = "request_search";
    public static final String REQUEST_TAG_STORY_CREATE = "request_story_create";
    public static final String REQUEST_TAG_STORY_GET = "request_story_get";
    public static final String REQUEST_TAG_COMMENT_LIST = "request_comment_list";
    public static final String REQUEST_TAG_COMMENT_GET = "request_comment_get";
    public static final String REQUEST_TAG_DESC_CREATE = "request_tag_desc_create";
    public static final String REQUEST_TAG_DESC_GET = "request_tag_desc_get";

    //PREFS
    public static final String PREFS_NAME = "MyPrefsFile";
    public static final String PREF_EMAIL = "email";
    public static final String PREF_USERNAME = "username";
    public static final String PREF_ACCESS_TOKEN = "token";
    public static final String PREF_USER_ID = "user_id";

    //JSON FIELDS
    public static final String FIELD_USERNAME = "username";
    public static final String FIELD_EMAIL = "email";
    public static final String FIELD_PASSWORD = "password";
    public static final String FIELD_QUERY = "query";
    public static final String FIELD_SIZE = "size";
    public static final String FIELD_PAGE = "page";
    public static final String FIELD_ID = "id";
    public static final String FIELD_TITLE = "title";
    public static final String FIELD_TAGS = "tags";
    public static final String FIELD_CONTENT = "content";
    public static final String FIELD_STORY_ID = "story_id";

    //BUNDLE KEYS
    public static final String BUNDLE_STORY_ID = "story_id";
    public static final String BUNDLE_IS_EDIT = "is_edit";
    public static final String BUNDLE_TAG_TITLE = "tag_title";
    public static final String BUNDLE_VISITED_USER_ID = "visited_user_id";
    public static final String BUNDLE_MEDIA_IDS = "media_ids";
    public static final String BUNDLE_INDEX = "index";

    //HEADER FIELDS
    public static final String HEADER_ACCESS_TOKEN = "access-token";

    //API ERRORS
    public static final String ERROR_INVALID_ACCESS_TOKEN = "Invalid access token";
    public static final String ERROR_INVALID_EMAIL = "Invalid email address";
    public static final String ERROR_INVALID_PASSWORD = "Invalid password";
    public static final String ERROR_INVALID_REPORT = "This User is already reported this story";
    public static final String ERROR_INVALID_USERNAME = "Invalid username";
    public static final String ERROR_USER_ALREADY_EXISTS = "This user already exists";
    public static final String ERROR_USER_NOT_EXIST = "This user does not exist";
    public static final String ERROR_WRONG_PASSWORD = "Wrong password";
}
