data class JSON(
    val user: User,
    val range: Range,
    val days: List<Day>
) {
    data class User(
        val bio: String? = null,
        val city: String? = null,
        val color_scheme: String? = "Dark",
        val created_at: String? = "2021-09-10T14:12:04Z",
        val date_format: String? = "YYYY-MM-DD",
        val default_dashboard_range: String? = "Last 7 Days",
        val display_name: String? = "Anonymous User",
        val durations_slice_by: String? = "Language",
        val email: String? = "software@gmail.com",
        val full_name: String? = null,
        val has_premium_features: Boolean? = false,
        val human_readable_website: String? = null,
        val id: String? = "uuid",
        val is_email_confirmed: Boolean? = true,
        val is_email_public: Boolean? = false,
        val is_hireable: Boolean? = false,
        val is_onboarding_finished: Boolean? = true,
        val languages_used_public: Boolean? = false,
        val last_heartbeat_at: String? = "2022-01-09T01:09:17Z",
        val last_plugin: String? = "wakatime/v1.32.1 (darwin-21.1.0-arm64) go1.17.5 AndroidStudio/Arctic Fox | 2020.3.1 Patch 4",
        val last_plugin_name: String? = "Android Studio",
        val last_project: String? = "Project1",
        val location: String? = null,
        val logged_time_public: Boolean? = false,
        val modified_at: String? = null,
        val needs_payment_method: Boolean? = false,
        val photo: String? = "https://wakatime.com/photo/aaa",
        val photo_public: Boolean? = true,
        val plan: String? = "basic",
        val profile_url: String? = "https://wakatime.com/@id",
        val profile_url_escaped: String? = "https://wakatime.com/@id",
        val public_email: String? = null,
        val public_profile_time_range: String? = "last_7_days",
        val share_all_time_badge: String? = null,
        val show_machine_name_ip: Boolean? = false,
        val time_format_24hr: String? = null,
        val time_format_display: String? = "text",
        val timeout: Int? = 15,
        val timezone: String? = "America/New_York",
        val username: String? = null,
        val website: String? = null,
        val weekday_start: Int? = 0,
        val writes_only: Boolean? = false
    )

    data class Range(
        val end: Long,
        val start: Long
    )

    data class Day(
        val categories: List<Category>,
        val date: String,
        val dependencies: List<Category>,
        val editors: List<Category>,
        val grand_total: GrandTotal,
        val languages: List<Category>,
        val machines: List<Machine>,
        val operating_systems: List<Category>,
        val projects: List<Project>
    )
    data class Project(
        val branches: List<Category>,
        val categories: List<Category>,
        val dependencies: List<Category>,
        val editors: List<Category>,
        val entites: List<Entity>,
        val grand_total: GrandTotal,
        val languages: List<Category>,
        val machines: List<Machine>,
        val name: String?,
        val operating_systems: List<Category>,
    )
    data class Category(
        val decimal: String? = "2.55",
        val digital: String? = "2:33:04",
        val hours: Int? = 2,
        val minutes: Int? = 33,
        val name: String? = "Coding",
        val percent: Double? = 100.0,
        val seconds: Int? = 4,
        val text: String? = "2 hrs 33 mins",
        val total_seconds: Double? = 9184.140000
    )
    data class Entity(
        val decimal: String? = "2.55",
        val digital: String? = "2:33:04",
        val hours: Int? = 2,
        val minutes: Int? = 33,
        val name: String? = "Coding",
        val percent: Double? = 100.0,
        val seconds: Int? = 4,
        val text: String? = "2 hrs 33 mins",
        val total_seconds: Double? = 9184.140000,
        val type: String?
    )

    data class Machine(
        val decimal: String? = "2.55",
        val digital: String? = "2:33:04",
        val hours: Int? = 2,
        val minutes: Int? = 33,
        val machine_name_id: String? = "UUID",
        val name: String? = "Coding",
        val percent: Double? = 100.0,
        val seconds: Int? = 4,
        val text: String? = "2 hrs 33 mins",
        val total_seconds: Double? = 9184.140000
    )

    data class GrandTotal(
        val decimal: String? = "2.55",
        val digital: String? = "2:33:04",
        val hours: Int? = 2,
        val minutes: Int? = 33,
        val text: String? = "2 hrs 33 mins",
        val total_seconds: Double? = 9184.140000
    )
}
